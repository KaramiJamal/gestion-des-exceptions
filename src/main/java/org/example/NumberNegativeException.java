package org.example;

public class NumberNegativeException extends Exception {
    private int val;
    public NumberNegativeException(int val) {
        this.val = val;
    }
    public NumberNegativeException(String message, int val) {
        super(message);
        this.val = val;
    }

    public int getExceptionCause(){
        return val;
    }
}

