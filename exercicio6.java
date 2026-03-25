/*Leia um ano e informe se ele é bissexto ou não. Sem tenário */

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Diga o ano: ");
        int ano = scanner.nextInt();
        
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
        
        scanner.close();
    }
}
