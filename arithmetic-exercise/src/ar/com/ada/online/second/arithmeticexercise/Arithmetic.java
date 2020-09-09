package ar.com.ada.online.second.arithmeticexercise;

import java.util.Scanner;

public class Arithmetic {

    public static void sum(double a, double b, Result finalResultSum) {
        double resultado = a + b;
        finalResultSum.setResultSum(resultado);
    }

    public static void subtraction(double a, double b, Result finalResultSubtraction) {
        double resultado = a - b;
        finalResultSubtraction.setResultSubtraction(resultado);
    }

    public static void multiplication (double a, double b, Result finalResultMultiplication) {
        double resultado = a * b;
        finalResultMultiplication.setResultMultiplication(resultado);
    }

    public static void division (double a, double b, Result finalResultDivision) {
        double resultado = a / b;
        finalResultDivision.setResultDivision(resultado);
    }
}
