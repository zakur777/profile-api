package com.wbarra.profileapi.persistence.validators.anotations;

import com.wbarra.profileapi.persistence.validators.ValidAgeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidAgeValidator.class)
public @interface ValidAge {
    String birthday();
    String age();

    String message() default "You must enter a valid age";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
