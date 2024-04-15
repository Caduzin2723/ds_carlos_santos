package Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    System.out.println("Digite quantos valores(inteiros) você deseja: ");
    int valores  = teclado.nextInt();

    for(int indice = 0; indice < valores; indice++){
        System.out.println("Digite o " + (indice + 1) + "°valor: ");
        
    }

    teclado.close();
    }

}
