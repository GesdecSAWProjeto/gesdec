package saw.web;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import saw.funcionario.Funcionario;
import saw.funcionario.FuncionarioRN;

@ManagedBean(name="funcionarioBean")
@RequestScoped

public class FuncionarioBean {
	
	private Funcionario funcionario = new Funcionario();
	private List<Funcionario> lista;
	
	public String salvar() {
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		funcionarioRN.salvar(this.funcionario);
		return "/admin/gerenciar_funcionario";
	}
	public String excluir() {
		FuncionarioRN funcionarioRN = new FuncionarioRN();
		funcionarioRN.excluir(this.funcionario);
		this.lista = null;
		return null;
	}
	public List<Funcionario> getLista() {
		if (this.lista == null) {
			FuncionarioRN funcionarioRN = new FuncionarioRN();
			this.lista = funcionarioRN.listar();
		}
		return this.lista;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
