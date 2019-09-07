package com.taylor.ono.phonenumberverifier;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Collection;

@Component
public class AssertPhoneNumberValidator implements ConstraintValidator<AssertPhoneNumber, Object> {

    private PhoneNumberVerifier phoneNumberVerifier = new PhoneNumberVerifier();

    @Override
    public void initialize(AssertPhoneNumber constraintAnnotation) {
        // Nothing to initialize
    }

    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        if (value.getClass().equals(String.class)) {
            return phoneNumberVerifier.isValidPhoneNumber(value.toString());
        }

        Collection<String> phoneNumbers = (Collection<String>) value;
        return phoneNumbers.stream().allMatch(phoneNumberVerifier::isValidPhoneNumber);
    }
}
