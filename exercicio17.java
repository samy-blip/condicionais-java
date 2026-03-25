
/*Uma loja dá desconto conforme o valor da compra:
Acima de R$ 500 → 20% de desconto
Entre R$ 200 e R$ 500 → 10% de desconto
Abaixo de R$ 200 → sem desconto
Leia o valor e exiba o valor final após o desconto. Sem ternário.
 */

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        
        double valorFinal;
        
        if (valorCompra > 500) {
            valorFinal = valorCompra * 0.8; // 20% de desconto
        } else if (valorCompra >= 200) {
            valorFinal = valorCompra * 0.9; // 10% de desconto
        } else {
            valorFinal = valorCompra; // sem desconto
        }
        
        System.out.printf("Valor final após desconto: R$ %.2f%n", valorFinal);
        
        scanner.close();
    }
    
}