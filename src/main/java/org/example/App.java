package org.example;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {

        Scanner ler = new Scanner(System.in);
        double operando;
        char operador;

        Calculadora calculadora = new Calculadora();

        System.out.printf("Digite o primeiro operando: ");
        operando = ler.nextDouble();
        calculadora.setOperandoA(operando);
        System.out.printf("%f \n", operando);

        System.out.printf("Digite o operador: ");
        operador = ler.next().charAt(0);
        calculadora.setOperacao(operador);
        System.out.printf("%c \n", operador);

        System.out.printf("Digite o segundo operando: ");
        operando = ler.nextDouble();
        calculadora.setOperandoB(operando);
        System.out.printf("%f \n", operando);

        System.out.println("Resultado = "+ calculadora.calculaOperacao());
    }
}
