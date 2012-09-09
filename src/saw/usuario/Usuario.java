package saw.usuario;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.NaturalId;

@Entity
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = -3652213596551573189L;
	@Id
	@GeneratedValue
	private Integer id_usuario;
	private Integer id_perfil;
	@NaturalId
	private String login;
	private String senha;
	private Date dt_cadastro;
	private Date dt_saida;
	
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Integer getId_perfil() {
		return id_perfil;
	}
	public void setId_perfil(Integer id_perfil) {
		this.id_perfil = id_perfil;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDt_cadastro() {
		return dt_cadastro;
	}
	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
	public Date getDt_saida() {
		return dt_saida;
	}
	public void setDt_saida(Date dt_saida) {
		this.dt_saida = dt_saida;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dt_cadastro == null) ? 0 : dt_cadastro.hashCode());
		result = prime * result
				+ ((dt_saida == null) ? 0 : dt_saida.hashCode());
		result = prime * result
				+ ((id_perfil == null) ? 0 : id_perfil.hashCode());
		result = prime * result
				+ ((id_usuario == null) ? 0 : id_usuario.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (dt_cadastro == null) {
			if (other.dt_cadastro != null)
				return false;
		} else if (!dt_cadastro.equals(other.dt_cadastro))
			return false;
		if (dt_saida == null) {
			if (other.dt_saida != null)
				return false;
		} else if (!dt_saida.equals(other.dt_saida))
			return false;
		if (id_perfil == null) {
			if (other.id_perfil != null)
				return false;
		} else if (!id_perfil.equals(other.id_perfil))
			return false;
		if (id_usuario == null) {
			if (other.id_usuario != null)
				return false;
		} else if (!id_usuario.equals(other.id_usuario))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	

}
