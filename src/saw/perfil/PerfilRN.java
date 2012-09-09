package saw.perfil;

import java.util.List;

import saw.util.DAOFactory;

public class PerfilRN {
	
	private PerfilDAO perfilDAO;
	
	public PerfilRN() {
		this.perfilDAO = DAOFactory.criarPerfilDAO();
	}
	public Perfil carregar(Integer id_perfil) {
		return this.perfilDAO.carregar(id_perfil);
	}
	public void salvar(Perfil perfil) {
		Integer id_perfil = perfil.getId_perfil();
		if (id_perfil == null || id_perfil == 0) {
			this.perfilDAO.salvar(perfil);
		} else {
			this.perfilDAO.atualizar(perfil);
		}
	}
	public void excluir(Perfil perfil) {
		this.perfilDAO.excluir(perfil);
	}
	public List<Perfil> listar() {
		return this.perfilDAO.listar();
	}

}
