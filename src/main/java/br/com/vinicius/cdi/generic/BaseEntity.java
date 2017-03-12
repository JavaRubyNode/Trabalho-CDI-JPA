package br.com.vinicius.cdi.generic;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class BaseEntity<T> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean isTransient;
	
	@Version
	private Integer version;

	/**@author vinicius
	 * @since 12/03/2017
	 * @return um valor booleano para checar id da entidade 
	 */
	public boolean isTransient() {return isTransient;}

	/**@author vinicius
	 * @since 12/03/2017
	 * @return a versão do objeto pessistido
	 */
	public Integer getVersion() {return version;}

	public abstract T getId();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}
	
	
	

}
