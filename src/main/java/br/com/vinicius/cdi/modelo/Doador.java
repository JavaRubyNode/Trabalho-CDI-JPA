package br.com.vinicius.cdi.modelo;

import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.vinicius.cdi.generic.BaseEntity;

public class Doador extends BaseEntity<Long>{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,unique=true,name="pk_doador_id")
	private Long id;
	
	@Column(nullable=false,unique=false,name="versao_doador")
	private Integer versionDoador;
    @Inject
    
    @Column(nullable=false,unique=false,name="pessoa")
	private Pessoa pessoa;
    
    @Column(nullable=false,unique=false,name="observacoes")
	private String observacoes;
	
	
	
	
	@Override
	public Integer getVersion() {return getVersionDoador();}

	@Override
	public Long getId() {return getId();}

	public Integer getVersionDoador() {return versionDoador;}

	public void setVersionDoador(Integer versionDoador) {this.versionDoador = versionDoador;}

	public Pessoa getPessoa() {return pessoa;}

	public void setPessoa(Pessoa pessoa) {this.pessoa = pessoa;}

	public String getObservacoes() {return observacoes;}

	public void setObservacoes(String observacoes) {this.observacoes = observacoes;}

	public Doador(Long id, Pessoa pessoa, String observacoes) {
		super();
		this.id = id;
		this.pessoa = pessoa;
		this.observacoes = observacoes;
	}

	public Doador() {super();}

	
	
	

}
