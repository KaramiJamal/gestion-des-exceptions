package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entierNaturel = new EntierNaturel(6);
            entierNaturel.decrementer(7);
        } catch (NumberNegativeException e) {
            e.printStackTrace();
            System.out.println(e.getExceptionCause());
        }
    }
}