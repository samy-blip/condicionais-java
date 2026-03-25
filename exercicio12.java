
/*Leia uma nota (0-10) e exiba o conceito:
9 a 10 → "A"
7 a 8 → "B"
5 a 6 → "C"
0 a 4 → "D"
 */

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga uma nota (0-10): ");
        double nota = scanner.nextDouble();

        String conceito;
        if (nota >= 9) {
            conceito = "A";
        } else if (nota >= 7) {
            conceito = "B";
        } else if (nota >= 5) {
            conceito = "C";
        } else {
            conceito = "D";
        }

        System.out.println("O conceito é: " + conceito);

        scanner.close();
    }
}
