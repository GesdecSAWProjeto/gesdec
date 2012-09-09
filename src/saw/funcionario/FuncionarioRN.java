package saw.funcionario;

import java.util.List;
import saw.util.DAOFactory;

public class FuncionarioRN {
	
	private FuncionarioDAO funcionarioDAO;
	
	public FuncionarioRN() {
		this.funcionarioDAO = DAOFactory.criarFuncionarioDAO();
	}
	public Funcionario carregar(Integer id) {
		return this.funcionarioDAO.carregar(id);
	}
	public void salvar(Funcionario funcionario) {
		Integer id = funcionario.getId();
		if (id == null || id == 0) {
			this.funcionarioDAO.salvar(funcionario);
		} else {
			this.funcionarioDAO.atualizar(funcionario);
		}
	}
	public void excluir(Funcionario funcionario) {
		this.funcionarioDAO.excluir(funcionario);
	}
	public List<Funcionario> listar() {
		return this.funcionarioDAO.listar();
	}

}
