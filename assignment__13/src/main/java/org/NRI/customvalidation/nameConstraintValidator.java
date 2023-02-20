package org.NRI.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class nameConstraintValidator implements ConstraintValidator<name,String>{

	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result=value.contains("nriFintech");
		return result;
	}

}