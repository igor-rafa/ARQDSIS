package model;

import to.UsuarioTO;
import dao.UsuarioDAO;

public class Usuario {
	private String usuario;
	private String senha;
	
	public Usuario(){
		
	}
	public Usuario(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.senha = password;
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
	
	public boolean validar(){
		UsuarioTO to = getTO();
		UsuarioDAO dao = new UsuarioDAO();
		return dao.validar(to);
	}
	public UsuarioTO getTO() {
		UsuarioTO to = new UsuarioTO();
		to.setUsuario(usuario);
		to.setSenha(senha);
		return to;
	}
}
