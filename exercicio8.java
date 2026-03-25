
/*Leia o peso (kg) e a altura (m) de uma pessoa, calcule o IMC (peso / altura²) e classifique:
IMC < 18.5 → "Abaixo do peso"
18.5 ≤ IMC < 25 → "Peso normal"
25 ≤ IMC < 30 → "Sobrepeso"
IMC ≥ 30 → "Obesidade"
Desafio: use o ternário para exibir se o IMC está "dentro" ou "fora" da faixa saudável.
*/

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Diga a altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        String faixaSaudavel = (imc >= 18.5 && imc < 25) ? "dentro" : "fora";
        System.out.println("O IMC é: " + imc);
        System.out.println("Classificação: " + classificacao);
        System.out.println("O IMC está " + faixaSaudavel + " da faixa saudável.");
        
        scanner.close();
    }
}
