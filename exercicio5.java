/*Leia dois números e um operador (+, -, *, /) e realize a operação correspondente usando switch. Trate a divisão por zero. */

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Diga o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Diga o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Escolha o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        double resultado;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("O resultado é: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("O resultado é: " + resultado);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }

        scanner.close();
    }

}