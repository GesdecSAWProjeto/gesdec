package saw.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import saw.perfil.Perfil;

@ManagedBean(name="perfilBean")
@RequestScoped

public class PerfilBean {
	
	private Perfil perfil = new Perfil();

}
