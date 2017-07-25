package br.snt.bgs.service.template.v1;

import java.text.ParseException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;

import br.snt.bgs.exceptions.TemplateExcecption;
import br.snt.bgs.response.TemplateResponse;

@WebService
public interface TemplateMicroService {
	
	
	@WebMethod(action = "template")
	@WebResult(name="TEMPLATE")
	public TemplateResponse consultaTemplate(@WebParam(name="DIA_SEMANA")String dataEntrada) throws TemplateExcecption, SOAPException, ParseException;

}
