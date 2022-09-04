package com.wbarra.profileapi.persistence.validators;

import com.wbarra.profileapi.persistence.validators.anotations.ValidAge;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ValidAgeValidator implements ConstraintValidator<ValidAge, Object> {

    private String birthday;
    private String age;

    @Override
    public void initialize(ValidAge constraintAnnotation) {
        birthday = constraintAnnotation.birthday();
        age = constraintAnnotation.age();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        try {
            Object value1 = getValue(value, birthday);
            Object value2 = getValue(value, age);

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthdayEntered = LocalDate.parse( value1.toString(), fmt);
            LocalDate now = LocalDate.now();

            Period period = Period.between(birthdayEntered, now);

            Integer estimatedAge  = period.getYears();
            Integer ageEntered = (Integer) value2;

            return estimatedAge.equals(ageEntered);

        } catch (Exception e) {
            throw new IllegalArgumentException(
                    "Cannot read '" + birthday + "', '" + age + "' fields from Object " + value,
                    e);
        }
    }

    private Object getValue(Object object, String fieldName) throws NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(object);
    }
}
