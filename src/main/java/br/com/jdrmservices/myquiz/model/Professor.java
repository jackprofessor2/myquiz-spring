package br.com.jdrmservices.myquiz.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import br.com.jdrmservices.myquiz.util.Constants;

@Entity
@Table(name = "professor")
public class Professor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank(message = Constants.NAME_REQUIRED)
	private String nome;
	
	@NotBlank(message = Constants.INSTITUTION_REQUIRED)
	private String instituicao;
	
	@NotBlank(message = Constants.EMAIL_REQUIRED)
	private String email;
	
	@NotBlank(message = Constants.PASSWORD_REQUIRED)
	private String senha;
	
	public boolean isNovo() {
		return this.codigo == null;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}	
}
