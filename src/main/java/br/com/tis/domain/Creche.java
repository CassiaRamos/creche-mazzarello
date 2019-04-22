package br.com.tis.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name = "Creche")
@Table(name = "creche")
public class Creche implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String telefone;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "creche")
	@JsonManagedReference
	private Endereco endereco;
	

	@OneToMany(mappedBy = "creche", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Trabalho> trabalhos = new ArrayList<Trabalho>();
	
	public Creche(String nome, String telefone, Endereco endereco) {
		super();
		this.setNome(nome);
		this.setTelefone(telefone);
	}
	
	public Creche() {
		
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void addTrabalho(Trabalho trabalho) {
		trabalhos.add(trabalho);
		trabalho.setCreche(this);
	}
	
	public void removeTrabalho(Trabalho trabalho) {
		trabalhos.remove(trabalho);
		trabalho.setCreche(null);
	}

	public List<Trabalho> getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(List<Trabalho> trabalhos) {
		this.trabalhos = trabalhos;
	}

	public Integer getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
