package br.sp.gov.etec.alocacao.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_grupo")
	
	private Long id;
	private String Nome;
	private Double valorDiariaGrupo;
	private Date dataCriacao;
	private Date dataAtualizacao;
	private Boolean status;
	
	public Long getId() {
		return id;
	}
	
	public String Nome() {
		return Nome;
	}
	
	public Double valorDiariaGrupo() {
		return valorDiariaGrupo;
	}
	
	public Date dataCriacao() {
		return dataCriacao;
	}
	
	public Date dataAtualizacao() {
		return dataAtualizacao;
	}
	
	public Boolean status ( ) {
		return status;
	}

}
