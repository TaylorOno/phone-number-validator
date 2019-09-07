package com.taylor.ono.phonenumberverifier;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
public class AssertPhoneNumberValidatorAnnotationTest {

    private Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Test
    public void AssertPhoneNumber_whenValueIsNull_hasNoConstraintViolations() {
        PhoneNumberDTO phoneNumber = new PhoneNumberDTO();
        phoneNumber.setPhoneNumber(null);

        Set<ConstraintViolation<PhoneNumberDTO>> constraintViolations = validator.validate(phoneNumber);
        validator.validate(phoneNumber);

        assertEquals(0, constraintViolations.size());
    }

    @Test
    public void AssertPhoneNumberDTO_whenValueIsInvalidPhoneNumberDTO_hasConstraintViolationWithMessage() {
        PhoneNumberDTO phoneNumber = new PhoneNumberDTO();
        phoneNumber.setPhoneNumber("33");

        Set<ConstraintViolation<PhoneNumberDTO>> constraintViolations = validator.validate(phoneNumber);
        validator.validate(phoneNumber);

        assertEquals(1, constraintViolations.size());
        assertEquals("has invalid format", constraintViolations.iterator().next().getMessage());
    }
}