package br.com.vinicius.cdi.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.vinicius.cdi.generic.BaseEntity;

public class Doacoes extends BaseEntity<Long>{

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_doacoes",nullable=false,unique=true)
	private Long id;
	
	@OneToMany(mappedBy = "pessoa", fetch =FetchType.LAZY)
	private List<Doador> doadores;
	
	@OneToMany(mappedBy = "doador", fetch =FetchType.LAZY)
	private List<RealizarDoacao> realizarDoacao;
	
	@Column(name="versaoDoacoes",nullable=false,length = 10)
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
