/*Leia a escolha de dois jogadores ("pedra", "papel" ou "tesoura") e determine quem venceu ou se houve empate usando if/else encadeado. Desafio: use o operador ternário para exibir o resultado final ("Jogador 1 venceu", "Jogador 2 venceu" ou "Empate"). */

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Jogador 1, escolha (pedra, papel ou tesoura): ");
        String jogador1 = scanner.nextLine().toLowerCase();
        
        System.out.print("Jogador 2, escolha (pedra, papel ou tesoura): ");
        String jogador2 = scanner.nextLine().toLowerCase();
        
        String resultado;
        
        if (jogador1.equals(jogador2)) {
            resultado = "Empate";
        } else if ((jogador1.equals("pedra") && jogador2.equals("tesoura")) ||
                   (jogador1.equals("papel") && jogador2.equals("pedra")) ||
                   (jogador1.equals("tesoura") && jogador2.equals("papel"))) {
            resultado = "Jogador 1 venceu";
        } else {
            resultado = "Jogador 2 venceu";
        }
        
        System.out.println(resultado);
        
        scanner.close();
    }


    
}
