package br.edu.fanor.Controller.Converter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "converterData")
public class ConverteData implements Converter {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String str) {
		Calendar c = new GregorianCalendar();
		sdf.setLenient(false);

		try {
			c.setTime(sdf.parse(str));
		} catch (Exception e) {
			return null;
		}
		return c.getTime();
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		//Calendar c = (Calendar) obj;
		
		Date c = (Date) obj;
		String str = sdf.format(c.getTime());
		
		return str;
	}
}
