package saw.perfil;

import java.util.List;

public interface PerfilDAO {
	
	public void salvar(Perfil perfil);
	public void atualizar(Perfil perfil);
	public void excluir(Perfil perfil);
	public Perfil carregar(Integer id_perfil);
	public List<Perfil> listar();

}
