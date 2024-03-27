package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        float idade = teclado.nextFloat();

        //Input das informações necessárias

        float anos = idade;
        float meses = idade * 12f;
        float dias = idade * 365.25f;
        //Fórmulas para descobiri aproximadamente os anos, meses e dias vividos

        System.out.println("\nVocê viveu: \nAnos: " + anos + "\nMeses: " + meses + "\nDias: " + dias);

    teclado.close();
    }
    
}
