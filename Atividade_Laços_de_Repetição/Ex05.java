package    Atividade_Laços_de_Repetição;
//@author Carlos Santos
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String calcular = "Sim";
    while(calcular == "Sim" || calcular == "sim"){
        System.out.println("Digite a a nota da 1° avaliação: ");
        float nota1 = teclado.nextFloat();

        while(nota1 < 0 || nota1 > 10){    
            System.out.println("\nNota inválida");
            return;
            }
        System.out.println("\nDigite a a nota da 2° avaliação: ");
        float nota2 = teclado.nextFloat();

        while(nota2 < 0 || nota2 > 10){    
            System.out.println("\nNota inválida");
            return;
            }

        float media = (nota1 + nota2) / 2;
        System.out.printf("\nSua média é %.2f", media);
                    
        System.out.println("\n\nDeseja calcular novamente? ");
        calcular = teclado.nextLine();
        }
    teclado.close();
    }

} 
