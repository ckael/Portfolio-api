package com.ckael.portfolio.model;

public class ExceptionModel {
	private String Message;
	private int Code;
	private String Type;
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public ExceptionModel(String message, int code, String type) {
		super();
		Message = message;
		Code = code;
		Type = type;
	}
	public ExceptionModel() {
	
	}
	
	
	
	
}
