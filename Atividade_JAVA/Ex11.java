package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
        float precoGasolina = 3.30f;
        float precoAlcool = 2.90f;
        //Declaração dos preços

        System.out.println("Digite qual combustível você vai comprar(A-ácool / G-gasolina): ");
        var combustivel = teclado.nextLine();

        System.out.println("Digite quantos litros vai comprar: ");
        float litros = teclado.nextFloat();

        //Input das informações necessárias

        
        if(combustivel == "A"){//Identificador de combustível 

            if (litros >= 20) {
                float precoFinal = litros * (3 / 100) * precoAlcool; //Desconto de 3%
            }
            else{
                float precoFinal = litros * (5 / 100) * precoAlcool; //Desconto de 5%
            }
        }
        else if (combustivel == "G") {
            
            if (litros >= 20) {
                float precoFinal = litros * (4 / 100) * precoGasolina; //Desconto de 4%
            }
            else{
                float precoFinal = litros * (6 / 100) * precoGasolina; //Desconto de 6%
            }
        }
        else{
            
            System.out.println("Combustível inválido");
            System.exit(0);
        }
 
        teclado.close();
        }

    }

