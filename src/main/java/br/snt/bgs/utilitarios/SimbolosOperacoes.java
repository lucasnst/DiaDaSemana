package br.snt.bgs.utilitarios;

import java.io.Serializable;

/**
 * Classe que representa todos os simbolos, operações matemática, parenteses
 * entre outras operações dos micro serviço
 * 
 * @author x190289 - Pedro Pacheco Manuel
 *
 */
public class SimbolosOperacoes implements Serializable {

	/**
	 * criação do atributo privado serial version da classe SimbolosOperacoes,
	 * que permite trafegar entre as camada de rede interna!
	 */
	private static final long serialVersionUID = 1L;
	private static final String SINAL_MAIS = "+";
	private static final String SINAL_MENOS = "-";
	private static final String SINAL_MULTIPLICACAO = "*";
	private static final String SINAL_DIVISAO = "/";
	private static final String SINAL_PORCENTAGEM = "%";
	private static final String SINAL_E_COMERCIAL = "&";
	private static final String SINAL_MENOS_IGUAL = "<=";
	private static final String SINAL_MAIOR_IGUAL = ">=";
	private static final String SINAL_IGUAL_IGUAL = "==";
	private static final String SINAL_DIFERENTE = "!";
	private static final String ABRI_PARENTESES = "(";
	private static final String FECHA_PARENTESES = ")";
	private static final String CARACTER_A = "A";
	private static final String CARACTER_B = "B";
	private static final String CARACTER_J = "J";
	private static final String CARACTER_N = "N";
	private static final String CARACTER_Z = "Z";

	/**
	 * contrutor da classe SimbolosOperacoes sem argumento
	 * 
	 * @return
	 */

	public SimbolosOperacoes() {
		
		super();
	}

	public static String getSinalMais() {
		return SINAL_MAIS;
	}

	public static String getSinalMenos() {
		return SINAL_MENOS;
	}

	public static String getSinalMultiplicacao() {
		return SINAL_MULTIPLICACAO;
	}

	public static String getSinalDivisao() {
		return SINAL_DIVISAO;
	}

	public static String getSinalPorcentagem() {
		return SINAL_PORCENTAGEM;
	}

	public static String getSinalEComercial() {
		return SINAL_E_COMERCIAL;
	}

	public static String getSinalMenosIgual() {
		return SINAL_MENOS_IGUAL;
	}

	public static String getSinalMaiorIgual() {
		return SINAL_MAIOR_IGUAL;
	}

	public static String getSinalIgualIgual() {
		return SINAL_IGUAL_IGUAL;
	}

	public static String getSinalDiferente() {
		return SINAL_DIFERENTE;
	}

	public static String getAbriParenteses() {
		return ABRI_PARENTESES;
	}

	public static String getFechaParenteses() {
		return FECHA_PARENTESES;
	}

	public static String getCaracterA() {
		return CARACTER_A;
	}

	public static String getCaracterB() {
		return CARACTER_B;
	}

	public static String getCaracterJ() {
		return CARACTER_J;
	}

	public static String getCaracterN() {
		return CARACTER_N;
	}

	public static String getCaracterZ() {
		return CARACTER_Z;
	}

}
