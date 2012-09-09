package saw.usuario;

import java.util.List;

import saw.util.DAOFactory;

public class UsuarioRN {
	
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN() {
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	public Usuario carregar(Integer id_usuario) {
		return this.usuarioDAO.carregar(id_usuario);
	}
	public void salvar(Usuario usuario) {
		Integer id_usuario = usuario.getId_usuario();
		if (id_usuario == null || id_usuario == 0) {
			this.usuarioDAO.salvar(usuario);
		} else {
			this.usuarioDAO.atualizar(usuario);
		}
		
	}
	public void inativar(Usuario usuario) {
		this.usuarioDAO.inativar(usuario);
	}
	public List<Usuario> listar() {
		return this.usuarioDAO.listar();
	}

}
