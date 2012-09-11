package saw.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import saw.usuario.Usuario;
import saw.usuario.UsuarioRN;

@ManagedBean(name="usuarioBean")
@RequestScoped

public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	private List<Usuario> lista;
	
	public String salvar() {
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
		return "/admin/gerenciar_usuario";
	}
	public String inativar() {
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.inativar(this.usuario);
		this.lista = null;
		return null;
	}
	public List<Usuario> getLista() {
		if (this.lista == null) {
			UsuarioRN usuarioRN = new UsuarioRN();
			this.lista = usuarioRN.listar();
		}
		return lista;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
