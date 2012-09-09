package saw.util;

import saw.aluno.AlunoDAO;
import saw.aluno.AlunoDAOHibernate;
import saw.funcionario.FuncionarioDAO;
import saw.funcionario.FuncionarioDAOHibernate;
import saw.perfil.PerfilDAO;
import saw.perfil.PerfilDAOHibernate;
import saw.usuario.UsuarioDAO;
import saw.usuario.UsuarioDAOHibernate;

public class DAOFactory {
	
	public static AlunoDAO criarAlunoDAO() {
		AlunoDAOHibernate alunoDAO = new AlunoDAOHibernate();
		alunoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return alunoDAO;
	}
	public static FuncionarioDAO criarFuncionarioDAO() {
		FuncionarioDAOHibernate funcionarioDAO = new FuncionarioDAOHibernate();
		funcionarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return funcionarioDAO;
	}
	public static PerfilDAO criarPerfilDAO() {
		PerfilDAOHibernate perfilDAO = new PerfilDAOHibernate();
		perfilDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return perfilDAO;
	}
	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
}
