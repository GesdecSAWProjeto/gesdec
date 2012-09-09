package saw.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import saw.funcionario.Funcionario;

@ManagedBean(name="funcionarioBean")
@RequestScoped

public class FuncionarioBean {
	
	private Funcionario funcionario = new Funcionario();
	

}
