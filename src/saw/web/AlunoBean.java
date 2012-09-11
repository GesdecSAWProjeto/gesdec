package saw.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import saw.aluno.Aluno;
import saw.aluno.AlunoRN;

@ManagedBean(name="alunoBean")
@RequestScoped

public class AlunoBean {
	
	private Aluno aluno = new Aluno();
	private List<Aluno> lista;
	
	public String salvar() {
		AlunoRN alunoRN = new AlunoRN();
		alunoRN.salvar(this.aluno);
		return "/admin/gerenciar_aluno";
	}
	public String excluir() {
		AlunoRN alunoRN = new AlunoRN();
		alunoRN.excluir(this.aluno);
		this.lista = null;
		return null;
	}
	public List<Aluno> getLista() {
		if (this.lista == null) {
			AlunoRN alunoRN = new AlunoRN();
			this.lista = alunoRN.listar();
		}
		return this.lista;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	

}
