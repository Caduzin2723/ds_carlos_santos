package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        double precoAlcool = 2.90f;  
        double precoGasolina = 3.30f;
        //Declaração dos preços

        System.out.println("\nDigite qual combustível você vai comprar(A-ácool / G-gasolina): ");
        char combustivel = teclado.next().charAt(0);

        System.out.println("\nDigite quantos litros vai comprar: ");
        double litros = teclado.nextDouble();
        //Input das informações necessárias

        double desonto = 0;
        double precoFinal = 0;
        double desconto;

        if(combustivel == 'A' || combustivel == 'a'){//Identificador de combustível 
            if (litros < 20) {
                precoFinal = litros * precoAlcool; 
                desconto = precoFinal * (3.0 / 100);//Desconto de 3%
            }else{
                precoFinal = litros * precoAlcool; 
                desconto = precoFinal * (5.0 / 100);//Desconto de 5%
            }
        }else if (combustivel == 'G' || combustivel == 'g') {
            if (litros < 20) {
                precoFinal = litros * precoGasolina; 
                desconto = precoFinal * (4.0 / 100);//Desconto de 4%
            }else{
                precoFinal = litros * precoGasolina; 
                desconto = precoFinal * (6.0 / 100);//Desconto de 6%
            }
        }else{
            System.out.println("\nCombustível inválido");
            return;
        }

        double precoDesc = precoFinal - desconto;
        System.out.printf("\nO preço à pagar será de R$%.2f%n", precoDesc);
 
        teclado.close();
        }

    }

