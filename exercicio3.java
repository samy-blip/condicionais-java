/* Exercício 3 — Aprovação Escolar
Leia a média de um aluno (0 a 10) e exiba:
"Aprovado" se média >= 7
"Recuperação" se média >= 5 e < 7
"Reprovado" se média < 5 
SEM TERNÁRIO */

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a média do aluno: ");
        double media = scanner.nextDouble();

        String resultado;
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
