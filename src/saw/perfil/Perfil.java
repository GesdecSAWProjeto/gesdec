package saw.perfil;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Perfil implements Serializable {
	
	private static final long serialVersionUID = 1809766587869617200L;
	@Id
	@GeneratedValue
	private Integer id_perfil;
	private String des_perfil;
	
	public Integer getId_perfil() {
		return id_perfil;
	}
	public void setId_perfil(Integer id_perfil) {
		this.id_perfil = id_perfil;
	}
	public String getDes_perfil() {
		return des_perfil;
	}
	public void setDes_perfil(String des_perfil) {
		this.des_perfil = des_perfil;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((des_perfil == null) ? 0 : des_perfil.hashCode());
		result = prime * result
				+ ((id_perfil == null) ? 0 : id_perfil.hashCode());
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
		Perfil other = (Perfil) obj;
		if (des_perfil == null) {
			if (other.des_perfil != null)
				return false;
		} else if (!des_perfil.equals(other.des_perfil))
			return false;
		if (id_perfil == null) {
			if (other.id_perfil != null)
				return false;
		} else if (!id_perfil.equals(other.id_perfil))
			return false;
		return true;
	}
	

}
