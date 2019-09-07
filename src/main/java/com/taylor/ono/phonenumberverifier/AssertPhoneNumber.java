package com.taylor.ono.phonenumberverifier;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, PARAMETER })
@Retention(RUNTIME)
@Constraint(validatedBy = AssertPhoneNumberValidator.class)
@Documented
public @interface AssertPhoneNumber {
    String message() default "has invalid format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}