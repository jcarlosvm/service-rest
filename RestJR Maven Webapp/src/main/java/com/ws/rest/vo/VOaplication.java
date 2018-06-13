package com.ws.rest.vo;

public class VOaplication {
	
	private String tituloAplicacion;
	private String datosExpediente;
	private String numeroContrato;
	private String numeroCliente;
	private String atributos;
	private String campo;
	private String valor;
	private Boolean leido;
	
	public String getTituloAplicacion() {
		return tituloAplicacion;
	}
	public void setTituloAplicacion(String tituloAplicacion) {
		this.tituloAplicacion = tituloAplicacion;
	}
	public String getDatosExpediente() {
		return datosExpediente;
	}
	public void setDatosExpediente(String datosExpediente) {
		this.datosExpediente = datosExpediente;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public String getAtributos() {
		return atributos;
	}
	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Boolean getLeido() {
		return leido;
	}
	public void setLeido(Boolean leido) {
		this.leido = leido;
	}
}
