package br.com.vinicius.cdi.modelo;

import java.util.List;

import javax.persistence.Id;

import br.com.vinicius.cdi.generic.BaseEntity;

public class Doacoes extends BaseEntity<Long>{

	@Id
	private Long id;
	
	private List<Doador> doadores;
	private List<RealizarDoacao> realizarDoacao;
	private Integer versionDoacoes;
	
	
	
	@Override
	public Long getId() {return getId();}

	@Override
	public Integer getVersion() {return getVersionDoacoes();}

	public List<Doador> getDoadores() {return doadores;}

	public void setDoadores(List<Doador> doadores) {this.doadores = doadores;}

	public List<RealizarDoacao> getRealizarDoacao() {return realizarDoacao;}

	public void setRealizarDoacao(List<RealizarDoacao> realizarDoacao) {this.realizarDoacao = realizarDoacao;}

	public Integer getVersionDoacoes() {return versionDoacoes;}

	public void setVersionDoacoes(Integer versionDoacoes) {this.versionDoacoes = versionDoacoes;}

	
	
	

}
