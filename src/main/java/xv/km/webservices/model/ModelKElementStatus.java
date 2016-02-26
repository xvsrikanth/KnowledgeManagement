package xv.km.webservices.model;

import xv.km.webservices.base.KElementStatus;

public class ModelKElementStatus extends KElementStatus {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModelKElementStatus() {
	}

	public ModelKElementStatus(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}