package com.jilmar.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.jilmar.cursomc.domain.Cliente;

public class ClienteDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	@NotEmpty(message="Preenchimento de nome eh obrigatorio")
	@Length(min=5, max=120, message="O tamanho do nome de Cliente deve ser entre 5 e 120 caracteres")
	private String nome;
	@NotEmpty(message="Preenchimento de email eh obrigatorio")
	@Email(message="Email Invalido")
	private String email;
	
	public ClienteDTO() {
		
	}

	public ClienteDTO(Cliente obj) {
		this.Id = obj.getId();
		this.email = obj.getEmail();
		this.nome = obj.getNome();
	}
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
