package ar.com.ada.online.second.arithmeticexercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el valor del numero A: ");
        a = keyboard.nextDouble();
        System.out.println("Ingrese el valor del numero B: ");
        b = keyboard.nextDouble();

        Result resultado = new Result();
        Arithmetic calculo = new Arithmetic();

        calculo.sum(a, b, resultado);
        double sumResult = resultado.getResultSum();
        System.out.println("El resultado de A + B es: " + sumResult);

        calculo.subtraction(a, b, resultado);
        double subtractionResult = resultado.getResultSubtraction();
        System.out.println("El resultado de A - B es: " + subtractionResult);

        calculo.multiplication(a, b, resultado);
        double multiplicationResult = resultado.getResultMultiplication();
        System.out.println("El resultado de A * B es: " + multiplicationResult);

        calculo.division(a, b, resultado);
        double divisionResult = resultado.getResultDivision();
        System.out.println("El resultado de A / B es: " + divisionResult);


    }
}
