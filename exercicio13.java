
/*Leia o número do mês (1-12) e exiba a estação do ano correspondente (considere o hemisfério sul).
Sem ternário */

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Diga o número do mês (1-12): ");
        int mes = scanner.nextInt();
        
        String estacao;
        if (mes == 12 || mes == 1 || mes == 2) {
            estacao = "Verão";
        } else if (mes >= 3 && mes <= 5) {
            estacao = "Outono";
        } else if (mes >= 6 && mes <= 8) {
            estacao = "Inverno";
        } else if (mes >= 9 && mes <= 11) {
            estacao = "Primavera";
        } else {
            estacao = "Mês inválido";
        }
        
        System.out.println("A estação do ano é: " + estacao);
        
        scanner.close();
    }
}