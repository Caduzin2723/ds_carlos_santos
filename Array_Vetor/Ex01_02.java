package Array_Vetor;
//@author Carlos Santos
import java.util.Scanner;

public class Ex01_02 {
public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    int numero [] = new int [10];
    int indice = 0;
    int menor = 0;

    System.out.println("\nDigite o " + indice + " número inteiro: ");
        numero[indice] = teclado.nextInt();
    menor = numero[indice];

    indice++;

    while(indice < 10){
        System.out.println("\nDigite o " + indice + "° número inteiro: ");
        numero[indice] = teclado.nextInt();

        if(menor > numero[indice]){
            menor = numero[indice]; // Compara o número digitado com o anterior
        }

        indice++;
    }

    System.out.println("\nO menor número digitado: " + menor);

    System.out.println("\n\nDigite o número procurado: ");
    int procurado = teclado.nextInt();

    indice = 0; //Reseta o valor do indice para ser reutilizado
    while(indice < 10){
        if(procurado == numero[indice]){
            procurado = indice;
            
        } 
        indice++;
    }

    System.out.println("\nO número procurado está no vetor[" + procurado + "]");

    teclado.close();
    }

}
