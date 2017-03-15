package br.com.vinicius.cdi.modelo;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.vinicius.cdi.generic.BaseEntity;

public class BancoDeSangue extends BaseEntity<Long>{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	private Endereco Endereco;
	private String telefone;
	private String email;
	private Integer versionBancoDeSangue; 
	
	
	
	@Override
	public Integer getVersion() {return getVersionBancoDeSangue();}

	@Override
	public Long getId() {return getId();}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public Endereco getEndereco() {return Endereco;}

	public void setEndereco(Endereco endereco) {Endereco = endereco;}

	public String getTelefone() {return telefone;}

	public void setTelefone(String telefone) {this.telefone = telefone;}

	public String getEmail() {return email;}

	public void setEmail(String email) {this.email = email;}

	public Integer getVersionBancoDeSangue() {return versionBancoDeSangue;}

	public void setVersionBancoDeSangue(Integer versionBancoDeSangue) {this.versionBancoDeSangue = versionBancoDeSangue;}



	
	
	

}
