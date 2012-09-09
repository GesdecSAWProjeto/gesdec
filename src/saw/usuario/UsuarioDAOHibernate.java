package saw.usuario;

import java.util.List;
import org.hibernate.Session;

public class UsuarioDAOHibernate implements UsuarioDAO {
	
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}
	public void salvar(Usuario usuario) {
		this.session.save(usuario);
	}
	public void atualizar(Usuario usuario) {
		this.session.update(usuario);
	}
	public void inativar(Usuario usuario) {
		this.session.delete(usuario);
	}
	public Usuario carregar(Integer id_usuario) {
		return (Usuario) this.session.get(Usuario.class, id_usuario);
	}
	@SuppressWarnings("unchecked")
	public List<Usuario> listar() {
		return this.session.createCriteria(Usuario.class).list();
	}

}
