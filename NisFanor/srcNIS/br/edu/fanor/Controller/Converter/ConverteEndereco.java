package br.edu.fanor.Controller.Converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.edu.fanor.model.entity.Endereco;

import model.JPA.EntityManagerUtil;

@FacesConverter(value = "converteEndereco")
public class ConverteEndereco implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String str) {

		if (str.equals(""))
			return null;
		else
			return EntityManagerUtil.getEntityManager().find(Endereco.class,
					Integer.parseInt(str));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		if (obj == null)
			return null;

		Endereco endereco = (Endereco) obj;
		return endereco.getId().toString();
	}

}
