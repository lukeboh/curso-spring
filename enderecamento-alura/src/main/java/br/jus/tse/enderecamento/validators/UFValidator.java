package br.jus.tse.enderecamento.validators;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.jus.tse.enderecamento.models.UF;

public class UFValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return UF.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "sigla", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "nome", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "situacao", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "codigoIBGE", "field.required");
		
	}
}
