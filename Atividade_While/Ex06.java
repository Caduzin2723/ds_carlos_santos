package Atividade_While;
//@author Carlos Santos
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int indice = 0;
    int maior1 = 0;
    int maior2 = 0;

    while (indice < 10) {
        indice++;
        System.out.println("Digite o " + indice + "° número(inteiro): ");
        int numero = teclado.nextInt();

        if (numero > maior1) {
            maior2 = maior1; // Atualiza o segundo maior número
            maior1 = numero; // Atualiza o maior número
        } else if (numero > maior2) {
            maior2 = numero; // Atualiza o segundo maior número
        }
    }

    System.out.println("\nOs dois maiores números digitados foram: " + maior1 + " e " + maior2);

    teclado.close();
    }

}
