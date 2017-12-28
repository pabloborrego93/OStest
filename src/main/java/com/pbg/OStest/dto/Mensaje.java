package com.pbg.OStest.dto;

import java.io.Serializable;

public class Mensaje implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6655705787383789044L;
	
	private String msg;
	
	public Mensaje(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}