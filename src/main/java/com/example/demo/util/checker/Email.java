package com.example.demo.util.checker;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CpEmailValidator.class)
public @interface Email {

    Class<?>[] groups() default{};

    String message() default "The email format is xxxx@domain.xx";

    Class<? extends Payload>[] payload() default {};
}