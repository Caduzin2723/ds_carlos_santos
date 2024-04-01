package Atividade_Switch_Case;
//@author Carlos Santos
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite o código do produto desejado: ");
    int codigo = teclado.nextInt();
    //Input das informações necessárias

    System.out.println("\nA classe desse produto é: ");

    switch (codigo){
        case 1:
            System.out.println("\nAlimento Não-Perecível\n");
            break;
        case 2:
        case 3:
        case 4:
            System.out.println("\nAlimento Perecível\n");
            break;
        case 5:
        case 6:
            System.out.println("\nVestuário\n");
            break;
        case 7:
            System.out.println("\nHigiene Pessoal\n");
            break;
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
            System.out.println("\nLimpeza e Utensílios Domésticos\n");
            break;
        default: 
            System.out.println("\nCódigo inválido!\n");
            break;
    }//Código para decisão de classe

    teclado.close();
    }
}