package Atividade_Switch_Case;
//@author Carlos Santos
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a 1° nota: ");
    double nota1 = teclado.nextDouble();

    System.out.println("\nDigite a 2° nota: ");
    double nota2 = teclado.nextDouble();
    //Input das informações necessária

    double media = (nota1 + nota2) / 2;

    System.out.printf("\n", media);
   switch ((int) media){
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.printf("\nReprovado!\nMédia: %.2f", media);
            break;
        case 5:
        case 6:
        case 7:
        System.out.printf("\nExame!\nMédia: %.2f", media);
            break;
        case 8:
        case 9:
        case 10:
        System.out.printf("\nAprovado!\nMédia: %.2f", media);
            break;
        default:
            System.out.println("Média Inválida");
   }
        
    teclado.close();
    }
}