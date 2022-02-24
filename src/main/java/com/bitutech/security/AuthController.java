package com.bitutech.security;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.employeeMaster.EmployeeMasterBean;
import com.bitutech.employeeMaster.EmployeeMasterController;
import com.bitutech.employeeMaster.EmployeeMasterResultBean;
import com.bitutech.employeeMaster.EmployeeMasterService;
import com.bitutech.usermanagement.ERole;
import com.bitutech.usermanagement.Role;
import com.bitutech.usermanagement.RoleRepository;
import com.bitutech.usermanagement.SignupRequest;
import com.bitutech.usermanagement.User;
import com.bitutech.usermanagement.UserDetailsImpl;
import com.bitutech.usermanagement.UserRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*", maxAge = 3600)
@Api(tags="Authentication", description="Manages Authentication operation")
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	
	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;

	@Autowired
	private EmployeeMasterService employeeMasterService;
	
	
	@ApiOperation(value = "Sign In")
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		//loginRequest.setPassword(jwtUtils.decrypt(loginRequest.getPassword()));
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);

		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		List<String> roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority())
				.collect(Collectors.toList());

		return ResponseEntity.ok(
				new JwtResponse(jwt, userDetails.getId(), userDetails.getUsername(), userDetails.getEmail(), roles,true,"Sucess"));
	}

	@ApiOperation(value = "Get user info by token")
	@GetMapping("/userbytoken")
	public Optional<User> getUserDetail(@RequestParam("token") String jwtToken) {
		Optional<User> userDetails = null;
		if (jwtToken != null && jwtUtils.validateJwtToken(jwtToken)) {
			String username = jwtUtils.getUserNameFromJwtToken(jwtToken);
			//userDetails = userRepository.findByUsername(username); // by Kannan for JPA
			try {
				userDetails = employeeMasterService.getEmployeeUserName(username);
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			userDetails.get().setPassword(null);

		}
		return userDetails;
	}

	@ApiOperation(value = "Sign Up")
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody EmployeeMasterBean employeeMasterBean) {
//		if (userRepository.existsByUsername(signUpRequest.getUsername())) {
//			
//			return ResponseEntity.badRequest().body(new MessageResponse("Username is already taken!"));
//		}
//
//		if (userRepository.existsByEmail(signUpRequest.getEmail())) {
//			return ResponseEntity.badRequest().body(new MessageResponse("Email is already in use!"));
//		}

		// Create new user's account
		/*
		 * User user = new User(signUpRequest.getUsername(), signUpRequest.getEmail(),
		 * encoder.encode(signUpRequest.getPassword()));
		 */

		/*
		 * Set<String> strRoles = signUpRequest.getRole(); Set<Role> roles = new
		 * HashSet<>();
		 * 
		 * if (strRoles == null) { Role userRole =
		 * roleRepository.findByName(ERole.ROLE_USER) .orElseThrow(() -> new
		 * RuntimeException("Error: Role is not found.")); roles.add(userRole); } else {
		 * strRoles.forEach(role -> { switch (role) { case "admin": Role adminRole =
		 * roleRepository.findByName(ERole.ROLE_ADMIN) .orElseThrow(() -> new
		 * RuntimeException("Error: Role is not found.")); roles.add(adminRole);
		 * 
		 * break; default: Role userRole = roleRepository.findByName(ERole.ROLE_USER)
		 * .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
		 * roles.add(userRole); } }); }
		 * 
		 * user.setRoles(roles); userRepository.save(user);
		 */
		
//		employeeMasterBean.setPassword(encoder.encode(employeeMasterBean.getPassword()));
//		EmployeeMasterResultBean insertAppUserMaster = employeeMasterService.addEmployeeMaster(employeeMasterBean); 
//		
		
		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}
	
}
