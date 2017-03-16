package br.com.vinicius.cdi.modelo;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.vinicius.cdi.generic.BaseEntity;

@Named
public class RealizarDoacao extends BaseEntity<Long>{

	@Id
	private Long id;
	private Integer versionRealizarDoacao;
	@Inject
	@Column(name="fk_doador",nullable=false)
	private Doador doador;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	@Basic(fetch=FetchType.LAZY)
	private Date dataDoacao;
	
	@Column(name="nome_enfermeira",nullable=false,length=30)
	private String nomeEnfermeira;
	
	@Inject
	@JoinColumn
	private Triagem triagem;
	
	
	
	@Override
	public Integer getVersion() {return getVersionRealizarDoacao();}

	@Override
	public Long getId() {return getId();}

	public Integer getVersionRealizarDoacao() {return versionRealizarDoacao;}

	public void setVersionRealizarDoacao(Integer versionRealizarDoacao) {this.versionRealizarDoacao = versionRealizarDoacao;}

	public Doador getDoador() {return doador;}

	public void setDoador(Doador doador) {this.doador = doador;}

	public Date getDataDoacao() {return dataDoacao;}

	public void setDataDoacao(Date dataDoacao) {this.dataDoacao = dataDoacao;}

	public String getNomeEnfermeira() {return nomeEnfermeira;}

	public void setNomeEnfermeira(String nomeEnfermeira) {this.nomeEnfermeira = nomeEnfermeira;}

	public Triagem getTriagem() {return triagem;}

	public void setTriagem(Triagem triagem) {this.triagem = triagem;}

	
	

}
