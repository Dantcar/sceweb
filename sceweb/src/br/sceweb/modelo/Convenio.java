package br.sceweb.modelo;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;

public class Convenio {
	private String cnpj;
	private DateTime dataInicio;
	private DateTime dataTermino;
	Logger logger = Logger.getLogger(Convenio.class);
	public Convenio(String cnpj, String dataInicio, String dataTermino){
	setCnpj(cnpj);
	setDataInicio(dataInicio);
	setDataTermino(dataTermino);
	}
	//métodos omitidos
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public DateTime getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public DateTime getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
}
