package iyun10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface NotNull {}
class NotNullClass {
    @NotNull
    private String nonNullField;

    private String nullableField;

    public NotNullClass(String nonNullField, String nullableField) {
        this.nonNullField = nonNullField;
        this.nullableField = nullableField;
    }
}