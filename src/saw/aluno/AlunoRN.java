package saw.aluno;

import java.util.List;
import saw.util.DAOFactory;

public class AlunoRN {
	
	private AlunoDAO alunoDAO;
	
	public AlunoRN() {
		this.alunoDAO = DAOFactory.criarAlunoDAO();
	}
	public Aluno carregar(Integer id) {
		return this.alunoDAO.carregar(id);
	}
	public void salvar(Aluno aluno) {
		Integer id = aluno.getId();
		if (id == null || id == 0) {
			this.alunoDAO.salvar(aluno);
		} else {
			this.alunoDAO.atualizar(aluno);
		}
	}
	public void excluir(Aluno aluno) {
		this.alunoDAO.excluir(aluno);
	}
	public List<Aluno> listar() {
		return this.alunoDAO.listar();
	}

}
