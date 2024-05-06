package Array_Vetor;
//@author Carlos Santos
import java.util.Scanner;

public class Ex03 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int vetor[] = new int[6];
    int indice = 0;
    int numerador = 1;
    int invertor = 0;
    
    while(indice < 6){
        System.out.println("Digite o " + numerador + "° valor: ");
        vetor[indice] = teclado.nextInt();

        indice++;
        numerador++;
    }

    indice = 0; //Reseta o valor do indice para ser reutilizado
    while(indice < 6){
        System.out.println("\nO valor do vetor[" + indice + "] é " + vetor[indice]);
        indice++;
    }

    invertor = vetor[0];
    vetor[0] = vetor[5];
    vetor[5] = invertor; //Troca os valores do vetor 1 e o 6

    invertor = vetor[1];
    vetor[1] = vetor[4];
    vetor[4] = invertor; //Troca os valores do vetor 2 e o 5

    invertor = vetor[2];
    vetor[2] = vetor[3];
    vetor[3] = invertor; //Troca os valores do vetor 3 e o 4
    

    indice = 0; //Reseta o valor do indice para ser reutilizado
    while(indice < 6){
        System.out.println("\nO valor do vetor[" + indice + "] agora é " + vetor[indice]);
        indice++;
    }


    teclado.close();
    }
}
