package org.fasttrackit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
public @interface MyFirstAnnotation {
    boolean flag() default false;

}
