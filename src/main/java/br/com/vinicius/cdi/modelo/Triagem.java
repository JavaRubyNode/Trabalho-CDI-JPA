package br.com.vinicius.cdi.modelo;


import java.util.Date;

import javax.persistence.Id;

import br.com.vinicius.cdi.generic.BaseEntity;

public class Triagem extends BaseEntity<Long>{

	@Id
	private Long id;
	private Integer versionTriagem;
	private Date dataLanchamento;
	private Doador doador;
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
