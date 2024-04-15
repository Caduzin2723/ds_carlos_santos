package Atividade_While;
//@author Carlos Santos
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    float comp = 0; // Variável de comparação
    int indice = 1;
    while(indice <= 10){
        System.out.println("\nDigite o " + indice + "° número: ");
        float n = teclado.nextFloat();

        if(n > comp){
            comp = n;
        }
        indice++;
    }
        System.out.println("\nO maior número digitado foi: " + comp);

    teclado.close();
    }

}
