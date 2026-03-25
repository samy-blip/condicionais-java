
/*Defina um usuário e senha fixos no código. Leia o usuário e a senha digitados e exiba "Acesso permitido" ou "Acesso negado". Obrigatório: use o operador ternário para exibir a mensagem.
 */

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usuarioFixo = "admin";
        String senhaFixa = "12345";
        
        System.out.print("Diga o usuário: ");
        String usuarioDigitado = scanner.nextLine();
        
        System.out.print("Diga a senha: ");
        String senhaDigitada = scanner.nextLine();
        
        String resultado = (usuarioDigitado.equals(usuarioFixo) && senhaDigitada.equals(senhaFixa)) ? "Acesso permitido" : "Acesso negado";
        System.out.println(resultado);
        
        scanner.close();
    }
    
}
