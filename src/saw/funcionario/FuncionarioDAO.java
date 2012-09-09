package saw.funcionario;

import java.util.List;

public interface FuncionarioDAO {
	
	public void salvar(Funcionario funcionario);
	public void atualizar(Funcionario funcionario);
	public void excluir(Funcionario funcionario);
	public Funcionario carregar(Integer id);
	public List<Funcionario> listar();
	

}
