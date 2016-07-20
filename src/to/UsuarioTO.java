package to;

import java.io.Serializable;

public class UsuarioTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String usuario;
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "UsuarioTO [usuario=" + usuario + ", senha=" + senha + "]";
	}

}
