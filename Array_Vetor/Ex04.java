package Array_Vetor;
//@author Carlos Santos
import java.util.Scanner;

public class Ex04 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int matriz[][] = new int [4][4];
    int i = 0;
    int j = 0;
    int maior = 0;
    int menor = 0;

    while(i < 4){
        while(j < 4){
            System.out.println("Digite o número da matriz[" + i + "][" + j + "]: ");
            matriz[i][j] = teclado.nextInt();
            j++;
        }
        j = 0;
        i++;
    }    
    i = 0;
    j = 0; //Reseta os valores de coluna e linha para serem reutilizados


    teclado.close();
    }
}
