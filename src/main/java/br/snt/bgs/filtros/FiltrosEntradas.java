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
public class FiltrosEntradas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7079247804897298254L;
	/**
	 * criação dos filhos de consulta das tabelas no banco de dado
	 */

	@XmlElement(name = "Banco", required = true)
	private String bccTa01; // Banco -> Entidad
	@XmlElement(name = "Agencia", required = true)
	private String agcTa01;// Agencia -> Centro_alta
	@XmlElement(name = "Conta", required = true)
	private String nrcTa01;// Conta -> Cuenta
	@XmlElement(name = "Produto", required = true)
	private String prcTa01;
	@XmlElement(name = "SubProduto", required = true)
	private String sbpcT01;
	@XmlElement(name="Cesta-Negocio", required = true)
	private String ctnEg01;

	public FiltrosEntradas() {
		super();
	}

	public String getBccTa01() {
		return bccTa01;
	}

	public void setBccTa01(String bccTa01) {
		this.bccTa01 = bccTa01;
	}

	public String getAgcTa01() {
		return agcTa01;
	}

	public void setAgcTa01(String agcTa01) {
		this.agcTa01 = agcTa01;
	}

	public String getNrcTa01() {
		return nrcTa01;
	}

	public void setNrcTa01(String nrcTa01) {
		this.nrcTa01 = nrcTa01;
	}

	public String getPrcTa01() {
		return prcTa01;
	}

	//
	public void setPrcTa01(String prcTa01) {
		this.prcTa01 = prcTa01;
	}

	public String getSbpcT01() {
		return sbpcT01;
	}

	public void setSbpcT01(String sbpcT01) {
		this.sbpcT01 = sbpcT01;
	}

	 public String getCtnEg01() {
	 return ctnEg01;
	 }
	
	 public void setCtnEg01(String ctnEg01) {
	 this.ctnEg01 = ctnEg01;
	 }
	

}