//Leia um número inteiro e informe se ele é par ou ímpar. Obrigatório: use o operador ternário para exibir a mensagem.

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número e diremos se ele é ímpar ou par: ");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("Seu número é: " + resultado);

        scanner.close();
    }
}