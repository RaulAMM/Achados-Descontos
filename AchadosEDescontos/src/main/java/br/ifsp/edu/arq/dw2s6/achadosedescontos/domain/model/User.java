package br.ifsp.edu.arq.dw2s6.achadosedescontos.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Usuario")
public class User {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idUsuario;
	
	
	@NotNull
	@Size(min = 3, max = 50)
	private String nome;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	private String senha;
	
	@NotNull
	private int tipo;
	
	
	
	//Getters e Setters
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}