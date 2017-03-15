package br.com.vinicius.cdi.modelo;

import javax.persistence.Id;

import br.com.vinicius.cdi.generic.BaseEntity;

public class Doador extends BaseEntity<Long>{

	@Id
	private Long id;
	private Integer versionDoador;
	private Pessoa pessoa;
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
