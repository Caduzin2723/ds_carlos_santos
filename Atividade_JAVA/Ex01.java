package Atividade_JAVA;
import java.util.Scanner;
// @author Carlos Santos
public class Ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("Diga em metros, a base desse retângulo: ");
        float b = teclado.nextFloat();

        System.out.println("Diga em metros, a altura desse retângulo: ");
        float h = teclado.nextFloat();
         if(h == b){
            System.out.println("\nEsta forma é um quadrado e não um retângulo!");
            System.exit(0);
         }
        float area = b * h;
        
        System.out.println("\nA área do retângula de base = " + b + " e altura = " + h+ " é " + area + "m²");

        teclado.close();
        }
    }
