package com.himanshu.jsf2.poc.converters.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "customValidatorBean")
@RequestScoped
public class CustomValidatorBean {

	String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
