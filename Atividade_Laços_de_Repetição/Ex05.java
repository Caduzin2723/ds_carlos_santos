package    Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex05 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a a nota da 1° avaliação: ");
    float nota1 = teclado.nextFloat();

    while (nota1 >= 0 || nota1 <= 10){    
        System.out.println("Digite a a nota da 2° avaliação: ");
        float nota2 = teclado.nextFloat();

        while (nota2 >= 0 || nota2 <= 10){
            float media = (nota1 + nota2) / 2;

            System.out.printf("Sua média é ", media);
        }
}

    teclado.close();
    }

} 
