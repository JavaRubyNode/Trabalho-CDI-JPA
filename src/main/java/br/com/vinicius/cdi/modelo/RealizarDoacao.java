package br.com.vinicius.cdi.modelo;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Id;
import br.com.vinicius.cdi.generic.BaseEntity;

@Named
public class RealizarDoacao extends BaseEntity<Long>{

	@Id
	private Long id;
	private Integer versionRealizarDoacao;
	@Inject
	private Doador doador;
	private Date dataDoacao;
	private String nomeEnfermeira;
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
