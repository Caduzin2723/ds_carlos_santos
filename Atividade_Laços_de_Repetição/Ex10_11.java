package Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex10_11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número inteiro: ");
    int num = teclado.nextInt();

    int indice = 0;

    System.out.println("\n");

    while(num == indice){
        System.out.println("\nO número precisa ser maior que 0");
        indice++;
    };
    while(num > indice){

        indice++;
        System.out.println("\n" + indice);
    };

    teclado.close();
    }

}

