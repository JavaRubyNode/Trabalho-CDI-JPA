package br.com.vinicius.cdi.modelo;

import java.util.Date;
import javax.inject.Named;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.vinicius.cdi.enums.RedeSocial;
import br.com.vinicius.cdi.enums.TipoSanguineo;
import br.com.vinicius.cdi.generic.BaseEntity;


@Named
@Table(name="pessoa")
public class Pessoa extends BaseEntity<Long>{

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pk_pessoa_id",unique=true,nullable=false)
	private Long id;
	
	@Column(nullable=false,length=40)
	@NotEmpty(message="campo obrigátorio")
	private String nome;
	
	
	private String sobrenome;
	@Enumerated(EnumType.STRING)
	private RedeSocial redeSocial;
	
	
	@Enumerated(EnumType.STRING)
	private TipoSanguineo TipoSanguineo;
	
	@Column(length=15,nullable=false,name="cpf_pessoa")
	@CPF(message="cpf invalido")
	private String cpf;
	
	@NotNull(message="campo obrigátorio")
	@Column(length=2,nullable=false)
	private int idade;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento",nullable=false)
	@Basic(fetch=FetchType.LAZY)
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataNascimento;
	
	
	private Integer versionPessoa;
	
	
	@Override public Integer getVersion() {return getVersionPessoa();}

	@Override public Long getId() {return id;}

	public Integer getVersionPessoa() {return versionPessoa;}

	public RedeSocial getRedeSocial() {return redeSocial;}

	public void setRedeSocial(RedeSocial redeSocial) {this.redeSocial = redeSocial;}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public String getSobrenome() {return sobrenome;}

	public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

	public TipoSanguineo getTipoSanguineo() {return TipoSanguineo;}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {TipoSanguineo = tipoSanguineo;}

	public String getCpf() {return cpf;}

	public void setCpf(String cpf) {this.cpf = cpf;}

	public int getIdade() {return idade;}

	public void setIdade(int idade) {this.idade = idade;}

	public Date getDataNascimento() {return dataNascimento;}

	public void setDataNascimento(Date dataNascimento) {this.dataNascimento = dataNascimento;}

	public Pessoa(Long id, String nome) {this.id = id;this.nome = nome;}

	public Pessoa() {super();}

	public Pessoa(String nome, String sobrenome, TipoSanguineo tipoSanguineo, String cpf,int idade, Date dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.TipoSanguineo = tipoSanguineo;
		this.cpf = cpf;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}



	
	
	
	

}
