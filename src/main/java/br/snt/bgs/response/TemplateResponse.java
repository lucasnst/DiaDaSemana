package br.snt.bgs.response;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
//
//feito em 07.06.2017 - Pedro pacheco Manuel 

public class TemplateResponse implements Serializable {

	
	private static final long serialVersionUID = 1L;
	

	@XmlElement(name = "NR_DIA_SEMANA")
	private int nrDiaSemana;

	@XmlElement(name = "NOME_DIA_SEMANA")
	private String nomeDiaSemana;

	public int getNrDiaSemana() {
		return nrDiaSemana;
	}

	public void setNrDiaSemana(int nrDiaSemana) {
		this.nrDiaSemana = nrDiaSemana;
	}

	public String getNomeDiaSemana() {
		return nomeDiaSemana;
	}

	public void setNomeDiaSemana(String nomeDiaSemana) {
		this.nomeDiaSemana = nomeDiaSemana;
	}



	
	
	




}
