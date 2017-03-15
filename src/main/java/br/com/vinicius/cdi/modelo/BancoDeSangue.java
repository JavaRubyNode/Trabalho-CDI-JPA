package br.com.vinicius.cdi.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.vinicius.cdi.generic.BaseEntity;

@Table(name = "Tb_bancos_de_sangue")
@Entity
public class BancoDeSangue extends BaseEntity<Long>{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "banco", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "endereco", nullable = false, length = 100)
	private Endereco Endereco;
	
	@Column(name = "telefone", nullable = false, length = 15)
	private String telefone;
	
	@Column(name = "email", nullable = false, length = 20)
	private String email;
	
	@Column(name = "versaoDoBanco", nullable = false, length = 10)
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

	public BancoDeSangue(String nome, br.com.vinicius.cdi.modelo.Endereco endereco, String telefone, String email) {
		super();
		this.nome = nome;
		Endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public BancoDeSangue() {super();}

	public BancoDeSangue(Long id, String nome) {super();this.id = id;this.nome = nome;}



	
	
	

}
