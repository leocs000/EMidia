package br.unitins.emidia.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.emidia.application.Util;
import br.unitins.emidia.model.Usuario;


@Named
@ViewScoped
public class UsuarioController implements Serializable{
	
	
	private static final long serialVersionUID = -3955368378894625110L;
	
	private Usuario usuario;
	private List<Usuario> listaUsuario;
	
	
	public void incluir() {
		int index = getListaUsuario().indexOf(getUsuario());
		if (index != -1) {
			Util.addMessage("Usuario já existe");
			return;
		}
		 
		getListaUsuario().add(getUsuario());
		limpar();
		
		Util.addMessage("Inclusão realizada com sucesso.");
	}
	
	public void editar(Usuario usu) {
		
		
		setUsuario(usu.getClone());
	}
	
	public void alterar() {
		int index = getListaUsuario().indexOf(getUsuario());
		getListaUsuario().set(index, getUsuario());
	}
	
	public void excluir() {
		excluir(getUsuario());
	}
	
	public void excluir(Usuario usu) {
		getListaUsuario().remove(usu);
		limpar();
		Util.addMessage("Exclusão realizada com sucesso!");
	}
	
	public void limpar() {
		usuario = null;
	}
	

	
	public List<Usuario> getListaUsuario() {
		if (listaUsuario == null)
			listaUsuario = new ArrayList<Usuario>();	
		return listaUsuario;
	}

	public Usuario getUsuario() {
		if (usuario == null) 
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
