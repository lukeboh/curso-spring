package br.jus.tse.enderecamento.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	@Column(name = "COD_IBGE", length = 4)
	private int codigoIBGE;

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

	@Override
	public String toString() {
		return "UF [sigla=" + sigla + ", nome=" + nome + ", codigoIBGE=" + codigoIBGE + "]";
	}

}
