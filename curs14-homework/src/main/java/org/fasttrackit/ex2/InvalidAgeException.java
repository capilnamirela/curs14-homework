package org.fasttrackit.ex2;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message){
        super(message);
    }
}
