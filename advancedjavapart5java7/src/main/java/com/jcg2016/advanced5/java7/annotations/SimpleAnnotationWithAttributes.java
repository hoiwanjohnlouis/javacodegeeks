package com.jcg2016.advanced5.java7.annotations;

public @interface SimpleAnnotationWithAttributes {
    String name();
    int order() default 0;
}
