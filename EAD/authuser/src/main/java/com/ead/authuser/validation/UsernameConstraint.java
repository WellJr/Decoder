package com.ead.authuser.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = UsernameConstraintImpl.class) // --> Classe que implementa a anotação
@Target({ElementType.METHOD, ElementType.FIELD}) // --> Diz onde pode implementar esta anotação (neste caso método e campo)
@Retention(RetentionPolicy.RUNTIME) // --> Define quando a validação ocorre
public @interface UsernameConstraint {
    String message() default "Invalid username";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
