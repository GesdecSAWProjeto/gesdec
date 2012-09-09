package saw.aluno;

import java.util.List;
import org.hibernate.Session;

public class AlunoDAOHibernate implements AlunoDAO {
	
	private Session session;
	public void setSession(Session session) {
		this.session = session;
	}
	public void salvar(Aluno aluno) {
		this.session.save(aluno);
	}
	public void atualizar(Aluno aluno) {
		this.session.update(aluno);
	}
	public void excluir(Aluno aluno) {
		this.session.delete(aluno);
	}
	public Aluno carregar(Integer id) {
		return (Aluno) this.session.get(Aluno.class, id);
	}
	@SuppressWarnings("unchecked")
	public List<Aluno> listar() {
		return this.session.createCriteria(Aluno.class).list();
	}

}
