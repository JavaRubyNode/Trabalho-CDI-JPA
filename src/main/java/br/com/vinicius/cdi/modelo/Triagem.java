package br.com.vinicius.cdi.modelo;


import java.util.Date;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.vinicius.cdi.generic.BaseEntity;

public class Triagem extends BaseEntity<Long>{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false,name="pk_triagem")
	private Long id;
	
	private Integer versionTriagem;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataLanchamento;
	
	@Inject
	@OneToOne()
	private Doador doador;
	
	@Column(name="aprovado_tipo")
	private boolean aprovado;
	
	
	@Override
	public Integer getVersion() {return getVersionTriagem();}

	@Override
	public Long getId() {return getId();}

	public Integer getVersionTriagem() {return versionTriagem;}

	public void setVersionTriagem(Integer versionTriagem) {this.versionTriagem = versionTriagem;}

	public Date getDataLanchamento() {return dataLanchamento;}

	public void setDataLanchamento(Date dataLanchamento) {this.dataLanchamento = dataLanchamento;}

	public Doador getDoador() {return doador;}

	public void setDoador(Doador doador) {this.doador = doador;}

	public Triagem(Long id, Date dataLanchamento) {super();this.id = id;this.dataLanchamento = dataLanchamento;}

	public Triagem(Date dataLanchamento, Doador doador) {super();this.dataLanchamento = dataLanchamento;this.doador = doador;}

	public Triagem() {super();}

	public boolean isAprovado() {return aprovado;}

	public void setAprovado(boolean aprovado) {this.aprovado = aprovado;}

	
	
	
	

}
