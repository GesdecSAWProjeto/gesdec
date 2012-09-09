package saw.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import saw.aluno.Aluno;

@ManagedBean(name="alunoBean")
@RequestScoped

public class AlunoBean {
	
	private Aluno aluno = new Aluno();
	

}
