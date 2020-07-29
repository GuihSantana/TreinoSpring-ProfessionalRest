package com.endpoint.profissionais.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "trilha")
public class Trilha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "trilha_nome")
	private String trilhaNome;
	private String diretoria;
	@Column(name = "missao_formal")
	private String missaoFormal;
	@Column(name = "missao_alternativa")
	private String missaoAlternativa;
	@Column(name = "data_atualizacao")
	private String dataAtualizacao;
	@OneToOne( mappedBy = "trilha")

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrilhaNome() {
		return trilhaNome;
	}

	public void setTrilhaNome(String trilhaNome) {
		this.trilhaNome = trilhaNome;
	}

	public String getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(String diretoria) {
		this.diretoria = diretoria;
	}

	public String getMissaoFormal() {
		return missaoFormal;
	}

	public void setMissaoFormal(String missaoFormal) {
		this.missaoFormal = missaoFormal;
	}

	public String getMissaoAlternativa() {
		return missaoAlternativa;
	}

	public void setMissaoAlternativa(String missaoAlternativa) {
		this.missaoAlternativa = missaoAlternativa;
	}

	public String getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
