package saw.funcionario;

import java.util.List;
import org.hibernate.Session;

public class FuncionarioDAOHibernate implements FuncionarioDAO {
	
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}
	public void salvar(Funcionario funcionario) {
		this.session.save(funcionario);
	}
	public void atualizar(Funcionario funcionario) {
		this.session.update(funcionario);
	}
	public void excluir(Funcionario funcionario) {
		this.session.delete(funcionario);
	}
	public Funcionario carregar(Integer id) {
		return (Funcionario) this.session.get(Funcionario.class, id);
	}
	@SuppressWarnings("unchecked")
	public List<Funcionario> listar() {
		return this.session.createCriteria(Funcionario.class).list();
	}

}
