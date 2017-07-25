package br.snt.bgs.exceptions;

import javax.xml.ws.WebFault;

/**
 * classe ConsultarSaldosException
 * 
 * @author x190289 Pedro Pacheco Manuel - data 07.06.2017
 *
 */
@WebFault(name = "template")
public class TemplateExcecption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mensagemErro = "Parametros Invalidos!";

	private String codigoErro = "10000";

	 
	public TemplateExcecption(String nome) {

		super(nome);
	}

	
}
