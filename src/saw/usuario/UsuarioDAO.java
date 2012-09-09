package saw.usuario;

import java.util.List;

public interface UsuarioDAO {
	
	public void salvar(Usuario usuario);
	public void atualizar(Usuario usuario);
	public void inativar(Usuario usuario);
	public Usuario carregar(Integer id_usuario);
	public List<Usuario> listar();

}
