package com.bitutech.salescallentry;

import java.io.Serializable;

import com.bitutech.core.util.BasicResultBean;

public class SalesCallEntryResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean success;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
