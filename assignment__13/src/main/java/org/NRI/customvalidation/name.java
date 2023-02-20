

package org.NRI.customvalidation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=nameConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface name {
  public String message() default "it must have nriFintech";
  public Class<?>[] groups() default {};
  public Class<? extends Payload>[] payload() default{};
}