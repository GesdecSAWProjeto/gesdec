package saw.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import saw.usuario.Usuario;

@ManagedBean(name="usuarioBean")
@RequestScoped

public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	

}
