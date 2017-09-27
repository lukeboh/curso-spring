package br.jus.tse.enderecamento.models;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class UF {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_OBJETO")
	private int id;

	@Column(name = "SGL_UF", length = 2, unique = true, nullable = false)
	private String sigla;
	@Column(name = "IND_SITUACAO", length = 1, nullable = false)
	private SituacaoUF situacao;
	@Column(name = "DES_UF", length = 45, nullable = false)
	private String nome;
	@Column(name = "COD_IBGE", length = 4, unique = true)
	private int codigoIBGE;
	@DateTimeFormat
	private Calendar dataCriacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoIBGE() {
		return codigoIBGE;
	}

	public void setCodigoIBGE(int codigoIBGE) {
		this.codigoIBGE = codigoIBGE;
	}

	public SituacaoUF getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoUF situacao) {
		this.situacao = situacao;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public String toString() {
		return "UF [id=" + id + ", sigla=" + sigla + ", situacao=" + situacao + ", nome=" + nome + ", codigoIBGE="
				+ codigoIBGE + ", dataCriacao=" + dataCriacao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
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
		UF other = (UF) obj;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}

}
