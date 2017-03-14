package br.com.vinicius.cdi.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.vinicius.cdi.enums.SigaUF;
import br.com.vinicius.cdi.generic.BaseEntity;

public class Endereco extends BaseEntity<Long>{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,unique=true,name="pk_endereco_id")
	private Long id;
	
	private Integer versionEndereco;
	
	
	private String logradouro;
	private String complemento;
	private String cep;
	private String estado;
	private SigaUF uf;
	
	
	@Override
	public Integer getVersion() {return getVersionEndereco();}

	@Override
	public Long getId() {return getId();}

	public Integer getVersionEndereco() {return versionEndereco;}

	public void setVersionEndereco(Integer versionEndereco) {this.versionEndereco = versionEndereco;}

	public String getLogradouro() {return logradouro;}

	public void setLogradouro(String logradouro) {this.logradouro = logradouro;}

	public String getComplemento() {return complemento;}

	public void setComplemento(String complemento) {this.complemento = complemento;}

	public String getCep() {return cep;}

	public void setCep(String cep) {this.cep = cep;}

	public String getEstado() {return estado;}

	public void setEstado(String estado) {this.estado = estado;}

	public SigaUF getUf() {return uf;}

	public void setUf(SigaUF uf) {this.uf = uf;}


	
	
	

}
