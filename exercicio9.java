
/*Leia um número de 1 a 7 e exiba o nome do dia da semana correspondente usando switch. Para qualquer outro número, exiba "Dia inválido" */

import java.util.Scanner;


public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga um número de 1 a 7: ");
        int dia = scanner.nextInt();

        String nomeDia;
        switch (dia) {
            case 1:
                nomeDia = "Segunda-feira";
                break;
            case 2:
                nomeDia = "Terça-feira";
                break;
            case 3:
                nomeDia = "Quarta-feira";
                break;
            case 4:
                nomeDia = "Quinta-feira";
                break;
            case 5:
                nomeDia = "Sexta-feira";
                break;
            case 6:
                nomeDia = "Sábado";
                break;
            case 7:
                nomeDia = "Domingo";
                break;
            default:
                nomeDia = "Dia inválido";
        }

        System.out.println("O dia da semana é: " + nomeDia);

        scanner.close();
    }
}
