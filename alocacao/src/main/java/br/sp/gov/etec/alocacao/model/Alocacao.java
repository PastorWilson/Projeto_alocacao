package br.sp.gov.etec.alocacao.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alocacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_Cliente")
	
	private Cliente cliente;
	private Carro carro;
	private Double valorAlocacao;
	private Date dataInicioAlocacao;
	private Date dataFimAlocacao;

	public Cliente cliente() {
		return cliente;
	}
	
	public Carro carro() {
		return carro;
	}
	
	public Double valorAlocacao() {
		return valorAlocacao;
	}
	
	public Date dataInicioAlocacao() {
		return dataInicioAlocacao;
	}
	
	public Date dataFimAlocacao() {
		return dataFimAlocacao;
	}
}
