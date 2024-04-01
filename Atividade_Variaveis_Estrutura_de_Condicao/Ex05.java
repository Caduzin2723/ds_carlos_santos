package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     
            System.out.println("Diga em metros, a base desse retângulo: ");
            float b = teclado.nextFloat();
    
            System.out.println("\nDiga em metros, a altura desse retângulo: ");
            float h = teclado.nextFloat();
            //Input das informações necessárias
    
             if(h == b){ //if caso tentem colocar as medidas de um quadrado
                System.out.println("\nEsta forma é um quadrado e não um retângulo!");
                return;
             }
    
            float area = b * h; //Fórmula para medir a área de um retângulo
            
            System.out.printf("\nA área do retângulo de base = %.2fm² e altura = %.2fm² é %.2fm²", b, h, area);
    
            teclado.close();
   }
    
}