package Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite um número inteiro: ");
    int n1 = teclado.nextInt();

    int indice = n1, fator = n1;
    
    System.out.println("\n1° = " + n1);
    n1 = 1;

    while (indice > 1) {

        indice = indice -1;
        fator = fator * indice;
        n1++;

        System.out.println("\n" + n1 + "° = " + fator);
    }

    teclado.close();
    }

}
