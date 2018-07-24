package br.com.jdrmservices.myquiz.model;

import java.io.Serializable;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import br.com.jdrmservices.myquiz.util.Constants;

@Entity
@Table(name = "quiz")
public class Quiz implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank(message = Constants.THEME_REQUIRED)
	private String tema;
	
	@NotBlank(message = Constants.STATEMENT_QUESTION_REQUIRED)
	private String enunciado;
	
	@NotNull(message = Constants.ALTERNATIVE_A)
	private String alta;
	
	@NotNull(message = Constants.ALTERNATIVE_B)
	private String altb;
	
	@NotNull(message = Constants.ALTERNATIVE_C)
	private String altc;
	
	@NotNull(message = Constants.ALTERNATIVE_D)
	private String altd;
	
	@NotBlank(message = Constants.CORRECT_ALTERNATIVE)
	private String resposta;
	
	public boolean isNovo() {
		return this.codigo == null;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getAlta() {
		return alta;
	}

	public void setAlta(String alta) {
		this.alta = alta;
	}

	public String getAltb() {
		return altb;
	}

	public void setAltb(String altb) {
		this.altb = altb;
	}

	public String getAltc() {
		return altc;
	}

	public void setAltc(String altc) {
		this.altc = altc;
	}

	public String getAltd() {
		return altd;
	}

	public void setAltd(String altd) {
		this.altd = altd;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
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
		Quiz other = (Quiz) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
