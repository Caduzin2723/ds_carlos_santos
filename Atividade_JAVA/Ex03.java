/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade_JAVA;
import java.util.Scanner;
/**
 *
 * @author Carlos Santos
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a distância que seu carro percorre com 1 litro de combusto(em Km)?");
        float KmL = teclado.nextFloat();

        System.out.println("Qual a distância você ira percorres?");
        float Km = teclado.nextFloat();

        System.out.println("Qual o preço uniário do combustível?");
        float VComb = teclado.nextFloat();

        float LitroG = Km / KmL;
        float prec = LitroG * VComb;

        System.out.println("Combustível gasto para percorrer essa distância" + LitroG + "\nO preço a pagar: R$" + prec);
    }
    
}
