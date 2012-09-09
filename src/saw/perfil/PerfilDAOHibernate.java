package saw.perfil;

import java.util.List;
import org.hibernate.Session;

public class PerfilDAOHibernate implements PerfilDAO {
	
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}
	public void salvar(Perfil perfil) {
		this.session.save(perfil);
	}
	public void atualizar(Perfil perfil) {
		this.session.update(perfil);
	}
	public void excluir(Perfil perfil) {
		this.session.delete(perfil);
	}
	public Perfil carregar(Integer id_perfil) {
		return (Perfil) this.session.get(Perfil.class, id_perfil);
	}
	@SuppressWarnings("unchecked")
	public List<Perfil> listar() {
		return this.session.createCriteria(Perfil.class).list();
	}

}
