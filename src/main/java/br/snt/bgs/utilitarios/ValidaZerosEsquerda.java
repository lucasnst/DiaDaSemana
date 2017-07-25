package br.snt.bgs.utilitarios;

import java.io.Serializable;

/**
 * 
 * @author x190289 - Pedro Pacheco Manuel data
 *         21/12/2016 @SuppressWarnings("serial")
 *
 */
public class ValidaZerosEsquerda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String zeroEsquerda(String valorAtual, int qtdNumerosEsquerda, char caraterZero) {
		
		String pegandoValorAtual = valorAtual;
		
		while (pegandoValorAtual.length() < qtdNumerosEsquerda) {
			
			pegandoValorAtual = caraterZero + pegandoValorAtual;
		}
		return pegandoValorAtual;
	}

}
