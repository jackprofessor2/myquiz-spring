package br.com.jdrmservices.myquiz.model;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "quiz")
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank(message = "Enuncioado é obrigatório")
	private String enunciado;
	
	@NotNull(message = "Alternativa 'A' é obrigatoria")
	private String altA;
	
	@NotNull(message = "Alternativa 'B' é obrigatória")
	private String altB;
	
	@NotNull(message = "Alternativa 'C' é obrigatória")
	private String altC;
	
	@NotNull(message = "Alternativa 'D' é obrigatória")
	private String altD;
	
	//@NotNull(message = "Alternativas são obrigatórias")
	//@ManyToOne
	//private List<String> alternativas = new ArrayList<>();
	
	@NotBlank(message = "Resposta é obrigatória")
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

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getAltA() {
		return altA;
	}

	public void setAltA(String altA) {
		this.altA = altA;
	}

	public String getAltB() {
		return altB;
	}

	public void setAltB(String altB) {
		this.altB = altB;
	}

	public String getAltC() {
		return altC;
	}

	public void setAltC(String altC) {
		this.altC = altC;
	}

	public String getAltD() {
		return altD;
	}

	public void setAltD(String altD) {
		this.altD = altD;
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
