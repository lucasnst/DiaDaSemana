package br.snt.bgs.utilitarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author x190289 - Pedro Pacheco Manuel
 *
 */

public class ConversaoDtString {
	
	

	public static Date convertToData(String data) throws ParseException {
		
		

		SimpleDateFormat formatacao = new SimpleDateFormat("YYYY-MM-dd");
		
		

		Date dt = new Date();
		
		dt = formatacao.parse(data);

		return dt;
	}
	
	/**
	 * conversão de data pra String
	 * @param data
	 * @return String como data
	 */

	public static String convertToString(Date data) {

		SimpleDateFormat formatacao = new SimpleDateFormat("YYYY-MM-dd");

		String dt = formatacao.format(data);

		return dt;
	}

}
