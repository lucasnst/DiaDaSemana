package br.snt.bgs.utilitarios;
//

//Pedro Manuel - 07-06-2017

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TemplateArrayDeObjeto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3666369319155577231L;

	private String entidad;

	private String centroAlta;

	private String cuenta;

	public TemplateArrayDeObjeto(String entidad, String centroAlta, String cuenta) {
		super();
		this.entidad = entidad;
		this.centroAlta = centroAlta;
		this.cuenta = cuenta;
	}

	public TemplateArrayDeObjeto() {

		super();

	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getCentroAlta() {
		return centroAlta;
	}

	public void setCentroAlta(String centroAlta) {
		this.centroAlta = centroAlta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	// depois de ter feito as alterações favor criar o contrutor
	// com todos os argumentos a cima , e os seus respectivos metodos gets e
	// sets

}
