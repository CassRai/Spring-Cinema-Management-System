package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Cinema;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CinemaValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {

        return Cinema.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Cinema c = (Cinema) target;

        for (Cinema ex : Hw1Application.cinemas) {
            if (ex.getId() == c.getId()) {
                errors.rejectValue("id", "", "ID already in use.");
            }
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Your cinema needs a name!");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "location", "", "There must be a location!");

    }
}
