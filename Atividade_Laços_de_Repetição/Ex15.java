package Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número(inteiro): ");
    int n = teclado.nextInt();
    
    int a = 1, b = 0, c = 0, i = 1;

    System.out.printf("%n%d° termo = %d", i, c);
    while(i <= n){
        i++;
        c = a + b;
        System.out.printf("%n%d° termo = %d", i, c);
        a = b;
        b = c;
    }

    teclado.close();
    }

}
