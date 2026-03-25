/*Leia um número inteiro e informe:
Se é múltiplo de 3 e de 5 simultaneamente
Se é múltiplo apenas de 3
Se é múltiplo apenas de 5
Se não é múltiplo de nenhum
Desafio: use o ternário onde for possível.
 */
import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        String resultado = (numero % 3 == 0 && numero % 5 == 0) ? "Múltiplo de 3 e de 5 simultaneamente" :
                          (numero % 3 == 0) ? "Múltiplo apenas de 3" :
                          (numero % 5 == 0) ? "Múltiplo apenas de 5" :
                          "Não é múltiplo de nenhum";
        
        System.out.println(resultado);
        
        scanner.close();
    }
    
}        








