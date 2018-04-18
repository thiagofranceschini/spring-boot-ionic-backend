package br.com.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import br.com.cursomc.domain.Cliente;

public class ClienteDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Integer id;
	@NotEmpty(message="Preenchimento Obrigatório.")
	@Length(min=5, max=80, message="Informe o valor entre 5 e 80 caracteres.")
	private String name;
	@NotEmpty(message="Preenchimento Obrigatório.")
	@Email(message="Email inválido.")
	private String email;
	
	public ClienteDTO(Cliente obj) {
		this.id =obj.getId();
		this.name = obj.getNome();
		this.email=obj.getEmail();
	}

	public ClienteDTO() {
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

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
