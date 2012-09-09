package saw.aluno;

import java.util.List;

public interface AlunoDAO {
	
	public void salvar(Aluno aluno);
	public void atualizar(Aluno aluno);
	public void excluir(Aluno aluno);
	public Aluno carregar(Integer id);
	public List<Aluno> listar();
	

}
