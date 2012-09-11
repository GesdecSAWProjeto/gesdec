package saw.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import saw.perfil.Perfil;
import saw.perfil.PerfilRN;

@ManagedBean(name="perfilBean")
@RequestScoped

public class PerfilBean {
	
	private Perfil perfil = new Perfil();
	private List<Perfil> lista;
	
	public String salvar() {
		PerfilRN perfilRN = new PerfilRN();
		perfilRN.salvar(this.perfil);
		return "/admin/gerenciar_perfil";
	}
	public String excluir() {
		PerfilRN perfilRN = new PerfilRN();
		perfilRN.excluir(this.perfil);
		this.lista = null;
		return null;
	}
	public List<Perfil> getLista() {
		if (this.lista == null) {
			PerfilRN perfilRN = new PerfilRN();
			this.lista = perfilRN.listar();
		}
		return lista;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}
