package Atividade_Switch_Case;
//@author Carlos Santos
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("100-Cachorro quente - R$ 1,70 \n101-Bauru Simples - R$ 2,30 \n102-Bauru com ovo - R$ 2,60 \n103-Hamburguer	- R$ 2,40 \n104-Cheeseburguer - R$ 2,50 \n105-Refrigerante - R$ 1,00 \n\nDigite O código do lanche desejado:");
        int cod_Lanche = teclado.nextInt();

        System.out.println("\nDigite quantos você vai comprar: ");
        float quant_Lanche = teclado.nextInt();

        float valor = 0;
        switch(cod_Lanche){
            case 100:
            valor = 1.70f * quant_Lanche;
            break;

            case 101:
            valor = 2.30f * quant_Lanche;
            break;

            case 102:
            valor = 2.60f * quant_Lanche;
            break;

            case 103:
            valor = 2.40f * quant_Lanche;
            break;

            case 104:
            valor = 2.50f * quant_Lanche;
            break;

            case 105:
            valor = 1.00f * quant_Lanche;
            break;

            default:
            System.out.println("Códico inválido");
            break;
        }
        System.out.printf("\nO valor final a pagar: R$%.2f", valor);
    teclado.close();
    }

}
