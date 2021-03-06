package br.com.vinicius.cdi.modelo;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.vinicius.cdi.enums.SiglaUF;
import br.com.vinicius.cdi.generic.BaseEntity;

public class Endereco extends BaseEntity<Long>{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,unique=true,name="pk_endereco_id")
	private Long id;
	
	@Column(name = "versaoDoEndereco", nullable = false, length = 80)
	private Integer versionEndereco;
	
	@Column(name = "logradouro", nullable = false, length = 100)
	private String logradouro;
	
	@Column(name = "complemento", nullable = false, length = 100)
	private String complemento;

	@Column(nullable=false,unique=false,name="cep")
	private String cep;
	
	@Column(name = "estado", nullable = false, length = 20)
	private String estado;
	
	@Enumerated(EnumType.STRING)
	private SiglaUF uf;
	
	
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

	public SiglaUF getUf() {return uf;}

	public void setUf(SiglaUF uf) {this.uf = uf;}

	public Endereco(String logradouro, String complemento, String cep, String estado, SiglaUF uf) {
		super();
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cep = cep;
		this.estado = estado;
		this.uf = uf;
	}

	public Endereco() {super();}

	public Endereco(Long id, String cep) {super();this.id = id;this.cep = cep;}


	
	
	

}
