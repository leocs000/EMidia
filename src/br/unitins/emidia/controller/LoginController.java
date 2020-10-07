package br.unitins.emidia.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginController {
	
	private String usuario;
	private String senha;
	
	
	public String entrar() {
		if (getUsuario().equals("leocs") && getSenha().equals("123")) {
			return "index.xhtml";
		}
	
		System.out.println("Usuario: "+usuario);
		System.out.println("Senha: "+senha);
		return "";
	}
	
	public void limpar() {
		usuario = "";
		senha = "";
		
		System.out.println("Limpar");
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
