package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
 
        System.out.println("Diga em metros, a base desse retângulo: ");
        float b = teclado.nextFloat();

        System.out.println("Diga em metros, a altura desse retângulo: ");
        float h = teclado.nextFloat();
        
        //Input das informações necessárias

         if(h == b){ 
        //if caso tentem colocar as medidas de um quadrado

            System.out.println("\nEsta forma é um quadrado e não um retângulo!");
            System.exit(0);
         }

        float area = b * h; //Fórmula para medir a área de um retângulo
        
        System.out.println("\nA área do retângula de base = " + b + " e altura = " + h+ " é " + area + "m²");

        teclado.close();
        }

    }
