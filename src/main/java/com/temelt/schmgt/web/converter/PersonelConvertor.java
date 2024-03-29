package com.temelt.schmgt.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import com.temelt.schmgt.web.data.repository.IkPersonelRepository;

import com.temelt.schmgt.web.entity.ik.Personel;
@Scope(value = "request")
@Controller("personelConverter")
public class PersonelConvertor implements Converter{
	
	@Autowired
	private IkPersonelRepository personelRepository;

	@Override
	public Object getAsObject(FacesContext contex, UIComponent component, String value) {
		if (value != null && value.trim().length() > 0 && !value.equals("null")) {
			try {
				Personel ent = personelRepository.findOne(new Long(value));
				return ent;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		} else {
			return null;
		}
	}
		
	

	@Override
	public String getAsString(FacesContext contex, UIComponent component, Object value) {
		if (value != null && !value.equals("null") && value instanceof Personel) {
			return String.valueOf(((Personel) value).getId());
		} else {
			return null;
		}
	
		
	}

}
