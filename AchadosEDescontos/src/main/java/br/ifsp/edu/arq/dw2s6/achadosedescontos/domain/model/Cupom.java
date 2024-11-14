package br.ifsp.edu.arq.dw2s6.achadosedescontos.domain.model;

import java.security.Timestamp;

import javax.print.attribute.standard.DateTimeAtProcessing;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cupom")
public class Cupom {
	private int id;
	private int QTD_Cupon;
	private Timestamp data_validade;
	private String instituicao;
	private String url;
	private String descricao;
	private String categoria;
	
	
	//Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQTD_Cupon() {
		return QTD_Cupon;
	}
	public void setQTD_Cupon(int qTD_Cupon) {
		QTD_Cupon = qTD_Cupon;
	}
	public Timestamp getData_validade() {
		return data_validade;
	}
	public void setData_validade(Timestamp data_validade) {
		this.data_validade = data_validade;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
