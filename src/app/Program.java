package app;

import entities.Calculadora;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        String continuar;
        boolean parar = false;

        while (!parar) {
            System.out.print("Insira um número:\nEx: 3.2\n=> ");
            float n1 = sc.nextFloat();
            System.out.print("Insira o tipo de operação que deseja fazer:\nEx: + | - | / | *\n=> ");
            String op = sc.next();
            System.out.print("Insira outro número:\nEx: 5.7\n=> ");
            float n2 = sc.nextFloat();

            float resultado = calculadora.processar(n1, op, n2);
            System.out.println("Resultado: " + resultado);

            System.out.print("Processo finalizado, deseja sair do programa? (s/n)\n=> ");
            continuar = sc.next();

            if (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim")) {
                sc.close();
                System.out.println("Saindo do programa...");
                parar = true;
            }
        }
    }
}