/*Leia três números inteiros e exiba qual é o maior entre os três. Trate o caso de empate. Sem ternário */

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Diga o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Diga o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Diga o terceiro número inteiro: ");
        int num3 = scanner.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("O número maior é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O número maior é: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O número maior é: " + num3);
        } else {
            System.out.println("Tem um empate entre os números.");
        }
        
        scanner.close();
    }
}