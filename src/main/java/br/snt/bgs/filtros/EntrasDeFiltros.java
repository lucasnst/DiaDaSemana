package br.snt.bgs.filtros;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author x190289 - Pedro Pacheco Manuel - data 07/06/2017
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EntrasDeFiltros {

	
	@XmlElement(name = "Produto")
	private List<FiltrosEntradas> litas;

	public EntrasDeFiltros() {

		super();
	}

	public List<FiltrosEntradas> getLitas() {
		return litas;
	}

	public void setLitas(List<FiltrosEntradas> litas) {
		this.litas = litas;

	}

	@Override
	public String toString() {
		return "EntrasDeFiltros [litas=" + litas + "]";
	}
	
	

}
