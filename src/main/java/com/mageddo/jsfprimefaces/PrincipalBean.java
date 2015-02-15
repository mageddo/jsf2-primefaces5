package com.mageddo.jsfprimefaces;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PrincipalBean {
	
	private String nomeSistema = "JSF 2 com primefaces 5.1";
	
	

	public String getNomeSistema() {
		return nomeSistema;
	}

	public void setNomeSistema(String nomeSistema) {
		this.nomeSistema = nomeSistema;
	}
	
	

}
