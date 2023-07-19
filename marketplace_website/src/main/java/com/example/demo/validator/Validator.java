package com.example.demo.validator;

public interface Validator<T> {
    public boolean validate(T t);
}
