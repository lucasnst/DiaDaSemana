package br.snt.bgs.cdc.templete.implement.v1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.jws.WebService;
import javax.xml.soap.SOAPException;

import br.snt.bgs.exceptions.TemplateExcecption;
import br.snt.bgs.response.TemplateResponse;
import br.snt.bgs.service.template.v1.TemplateMicroService;

/**
 * 
 * @author x190289 - Pedro Pacheco Manuel - data de criação 07.06.2017
 *
 */
@WebService(endpointInterface = "br.snt.bgs.service.template.v1.TemplateMicroService")
public class DiaSemana implements TemplateMicroService {

	
	public DiaSemana() {

		super();
	}

	@Override
	public TemplateResponse consultaTemplate(String dataEntrada) throws TemplateExcecption, SOAPException, ParseException {
		
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
	
	Date data1  = format1.parse(dataEntrada);
		
	Calendar c = Calendar.getInstance();
	c.setTime(data1);
	int nrDia = c.get(Calendar.DAY_OF_WEEK);
				
	TemplateResponse response = new TemplateResponse();
	response.setNrDiaSemana(nrDia);
	switch (nrDia){
		case 1:
			response.setNomeDiaSemana("Domingo"); 
	        break;
		case 2:
			response.setNomeDiaSemana("Segunda-feira"); 
	        break;
		case 3:
			response.setNomeDiaSemana("Terça-feira"); 
	        break;
		case 4:
			response.setNomeDiaSemana("Quarta-feira"); 
	        break;	
		case 5:
			response.setNomeDiaSemana("Quinta-feira"); 
	        break;
		case 6:
			response.setNomeDiaSemana("Sexta-feira"); 
	        break;
		case 7:
			response.setNomeDiaSemana("Sábado"); 
	        break;
	}
	
	return response;
		
	}

	
}
