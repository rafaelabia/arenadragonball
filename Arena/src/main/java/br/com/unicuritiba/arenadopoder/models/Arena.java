package br.com.unicuritiba.arenadopoder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arena {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String bioma;
	private String nome;
	private float multiplicador;
	private String localizacao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBioma() {
		return bioma;
	}
	public void setBioma(String bioma) {
		this.bioma = bioma;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getMultiplicador() {
		return multiplicador;
	}
	public void setMultiplicador(float multiplicador) {
		this.multiplicador = multiplicador;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

}
