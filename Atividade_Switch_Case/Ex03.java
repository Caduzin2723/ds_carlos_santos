package Atividade_Switch_Case;
//@author Carlos Santos
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite qual operação você deseja realizar(1-Média 2-Diferença 3-Multiplicação 4-Divisão):");
    int operador = teclado.nextInt();
    //Input das informações necessária

    String operado = " ";
    float resultado = 0;

    switch (operador) { //Separa caso 1, 2, 3, 4 de qualquer outro
    case 1:
    case 2:
    case 3:
    case 4:
        System.out.println("\nDigite o 1° valor: ");
        float n1 = teclado.nextFloat();
        
        System.out.println("\nDigite o 2° valor: ");
        float n2 = teclado.nextFloat();

        switch (operador) {//Separa e realiza cada operação
            case 1:
                operado = "Média";
                resultado = (n1 + n2) / 2;
                break;
            case 2:
                operado = "Diferença";
                resultado = n1 - n2;
                break;
            case 3:
                operado = "Multiplicaçã";
                resultado = n1 * n2;
                break;
            case 4:
                operado = "Divisão";
                resultado = n1 / n2;
                break;
        }
        System.out.printf("%nVocê escolheu o operador '%s'%nO resultado é %.2f%n", operado, resultado);
        break;
    default:
        System.out.println("Operador Inválido!");
        break;
    }

    teclado.close();
    }

}
    