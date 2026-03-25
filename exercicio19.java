/*Leia a velocidade de um veículo e o limite da via. Classifique:
Dentro do limite → "Sem multa"
Até 20% acima → "Multa leve"
Entre 20% e 50% acima → "Multa grave"
Acima de 50% → "Multa gravíssima + suspensão" Sem ternário */

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a velocidade do veículo (km/h): ");
        double velocidade = scanner.nextDouble();
        
        System.out.print("Digite o limite de velocidade da via (km/h): ");
        double limite = scanner.nextDouble();
        
        String classificacao;
        
        if (velocidade <= limite) {
            classificacao = "Sem multa";
        } else if (velocidade <= limite * 1.2) {
            classificacao = "Multa leve";
        } else if (velocidade <= limite * 1.5) {
            classificacao = "Multa grave";
        } else {
            classificacao = "Multa gravíssima + suspensão";
        }
        
        System.out.println("Classificação: " + classificacao);
        
        scanner.close();
    }
    
}