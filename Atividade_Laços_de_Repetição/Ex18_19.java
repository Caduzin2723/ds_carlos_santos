package Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex18_19 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite quantos valores(inteiros) você deseja(\nDigite números entre 0 e 1000): ");
    int valores  = teclado.nextInt();

    while(valores < 0 || valores > 1000){ // Para o programa caso ultrapasse o limite de valores
        System.out.println("\nDigite números entre 0 e 1000");
        return;
    }

    int n2 = 0;
    for(int indice = 0; indice < valores; indice++){
        System.out.println("\nDigite o " + (indice + 1) + "°valor(entre 0 e 1000): ");
        int n1 = teclado.nextInt();

        while(n1 < 0 || n1 > 1000){ // Para o programa caso ultrapasse o limite de valores
            System.out.println("\nDigite números entre 0 e 1000");
            return;
        }

        while(n1 > n2) { // Guarda o maior número
            n2 = n1;
        }
    }
    System.out.println("\nO maior número digitado foi: " + n2);

    teclado.close();
    }

}
