package com.bonvoyage.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.bonvoyage.domain.ZipCode;

public class ZipCodeFormatter implements Formatter<ZipCode>{

	@Override
	public String print(ZipCode zipCode, Locale locale) {
		if (zipCode.getPlusFour()==0)
			return zipCode.getBasicCode() + "";
		return zipCode.getBasicCode() + "-" + zipCode.getPlusFour();
	}

	@Override
	public ZipCode parse(String source, Locale locale) throws ParseException {
		ZipCode zipCode = new ZipCode();
		zipCode.setBasicCode(Integer.parseInt(source.substring(0, 4)));
		zipCode.setPlusFour(Integer.parseInt(source.substring(6)));
		return zipCode;
	}

}
