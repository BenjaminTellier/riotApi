package com.chauss.exception;

public class ProductNotFoundException extends Exception{

    public ProductNotFoundException() {
        super("Product not found");
    }
}
