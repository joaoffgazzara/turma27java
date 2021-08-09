package com.generation.lojagames.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Size(min = 1)
		@NotBlank
		private String nome;
		
		@Size(min = 1)
		@NotNull
		private String login;
		
		@Size(min = 6)
		@NotNull
		private String senha;
		
		@Column(name = "data_nascimento")
		@JsonFormat(pattern = "yyyy-MM-dd")
		private LocalDate dataNascimento;

		@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("usuario")
		private List<Produtos> produto;
		
		
	public List<Produtos> getProduto() {
			return produto;
		}

		public void setProduto(List<Produtos> produto) {
			this.produto = produto;
		}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
