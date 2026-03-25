/*Leia três lados e verifique se formam um triângulo válido. Se sim, classifique como equilátero, isósceles ou escaleno. Sem tenário */

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Diga o primeiro lado: ");
        double lado1 = scanner.nextDouble();
        
        System.out.print("Diga o segundo lado: ");
        double lado2 = scanner.nextDouble();
        
        System.out.print("Diga o terceiro lado: ");
        double lado3 = scanner.nextDouble();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triângulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }
        
        scanner.close();
    }

    
}
