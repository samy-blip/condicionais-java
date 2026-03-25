/*Uma sala de cinema cobra:
Menores de 12 anos: R$ 10,00
Entre 12 e 60 anos: R$ 20,00
Acima de 60 anos: R$ 10,00 (meia)
Leia a idade e exiba o valor do ingresso.
 */

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        double valorIngresso;
        if (idade < 12) {
            valorIngresso = 10.00;
        } else if (idade <= 60) {
            valorIngresso = 20.00;
        } else {
            valorIngresso = 10.00; // meia
        }
        
        System.out.printf("O valor do ingresso é: R$ %.2f%n", valorIngresso);
        
        scanner.close();
    }
}