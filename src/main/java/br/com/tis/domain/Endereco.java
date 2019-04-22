package br.com.tis.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "Endereco")
@Table(name="endereco")
public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String bairro;
	private String logradouro;
	private int numero;
	private int complemento;
	private int cep;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "creche_id", nullable = true)
	@JsonBackReference
	private Creche creche;
	
	public Endereco() {
		
	}
	
	public Endereco(String bairro, String logradouro, int numero, int complemento, int cep) {
		super();
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
	}

	public Creche getCreche() {
		return creche;
	}

	public void setCreche(Creche creche) {
		this.creche = creche;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getComplemento() {
		return complemento;
	}
	public void setComplemento(int complemento) {
		this.complemento = complemento;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
}
