
package Calculadora;

import java.util.Scanner;


public class Calc_Java {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola Mundo!!!");

     
        Scanner recebe = new Scanner(System.in);

        int numero;
        Double numero1;
        Double numero2;
        Double resultado;
        numerico calculadora = new numerico();
        System.out.println("Digite o primeiro numero:");
        numero1 = recebe.nextDouble();
        System.out.println("Digite o segundo numero:");
        numero2 = recebe.nextDouble();
        System.out.println("----- CALCULADORA -----");
        System.out.println("Selecione a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");

        numero = recebe.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Soma");
                resultado = calculadora.soma(numero1, numero2);
                System.out.println("resultado: " + resultado);

                break;
            case 2:
                System.out.println("Subtração");
                resultado = calculadora.subtração(numero1, numero2);
                System.out.println("resultado: " + resultado);

                break;
            case 3:
                System.out.println("Multiplicação");
                resultado = calculadora.multiplicacao(numero1, numero2);
                System.out.println("resultado: " + resultado);

                break;
                    case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("O resultado da divisão é: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero!");
                }
                break;
                
            default:
                System.out.println("Operação inválida!");
                break;
       
            case 5:
                System.out.println("Sair");
                break;
            
        }

    }

    private static void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void Else(Double divisao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
