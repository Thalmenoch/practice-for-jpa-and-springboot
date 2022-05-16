package br.edu.ifce.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "tbl_aluno")
public class Aluno {
	@Id
	@GeneratedValue
	private Long id;
	
	//length: Limita a quantidade de caracteres de uma String
	//nullable: Determina se o campo pode oissuir valores null ou n�o
	//unique: Determina se uma coluna pode ter valores repetidos ou n�o
	//precision: Determina a quantidade de digitos de um numero decimal a serem armazenadas
	//scale: Determina a quntidade de casas decimais de um numero decimal
	
	@Column (name = "nome_aluno")
	private String nome;
	
	@Column (name = "rg")
	private String RG;
	
	@Column (name = "cpf")
	private String CPF;
	
	@Embedded
	private Endereco endereco;
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@OneToMany
	private Collection<Telefone> telefone = new ArrayList<Telefone>();
	
	public Collection<Telefone> getTelefone() {
		return telefone;
	}
	public void setTelefone(Collection<Telefone> telefone) {
		this.telefone = telefone;
	}
	
	@Column(name = "ira_aluno", length = 30, nullable = false, scale = 2 , precision = 2 )
	private Double ira;
	
	//Large Objects
	@Lob
	private byte [] fotografia ;
	
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
	
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public byte[] getFotografia() {
		return fotografia;
	}
	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}
	public Double getIra() {
		return ira;
	}
	public void setIra(Double ira) {
		this.ira = ira;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
}
