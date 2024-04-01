package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite o 1° número: ");
    double n1 = teclado.nextDouble();

     System.out.println("\nDigite o 2° número: ");
    double n2 = teclado.nextDouble();
    //Input das informações necessária

    System.out.printf("\nSoma entre eles: %.2f", n1+n2);
    System.out.printf("\nSubtração entre eles: %.2f", n1-n2);
    System.out.printf("\nMultiplicação entre eles: %.2f", n1*n2);
    System.out.printf("\nDivisão entre eles: %.2f%n", n1/n2);

    teclado.close();
    }
}
