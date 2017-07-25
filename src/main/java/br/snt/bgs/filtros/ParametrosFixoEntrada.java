package br.snt.bgs.filtros;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
/**
 * 
 * @author x190289 - Pedro Pacheco Manuel - data 07/06/2017
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ParametrosFixoEntrada implements Serializable{

	/**
	 * atributos da classe ParametrosFixoEntrada
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(required=true,name="Canal")
	private String cdcCanal;
	@XmlElement(required=true,name="Servico")
	private String cdcServi;
	@XmlElement(required=true,name="Penumper")
	private String penumper;
	@XmlElement(required=true,name="Quantidade-Contrato")
	private Integer qtCtrin;
	
	public ParametrosFixoEntrada() {
		super();
	}

	public String getCdcCanal() {
		return cdcCanal;
	}

	public void setCdcCanal(String cdcCanal) {
		this.cdcCanal = cdcCanal;
	}

	public String getCdcServi() {
		return cdcServi;
	}

	public void setCdcServi(String cdcServi) {
		this.cdcServi = cdcServi;
	}

	public String getPenumper() {
		return penumper;
	}

	public void setPenumper(String penumper) {
		this.penumper = penumper;
	}

	public Integer getQtCtrin() {
		return qtCtrin;
	}

	public void setQtCtrin(Integer qtCtrin) {
		this.qtCtrin = qtCtrin;
	}
	
}
