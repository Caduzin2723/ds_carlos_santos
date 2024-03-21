package Atividade_JAVA;
import java.util.Scanner;
//@author Carlos Santos
public class Ex03 {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a distância que seu carro percorre com 1 litro de combusto(em Km)?");
        float KmL = teclado.nextFloat();

        System.out.println("Qual a distância você vai percorrer?");
        float Km = teclado.nextFloat();

        System.out.println("Qual o preço uniário do combustível?");
        float VComb = teclado.nextFloat();

        float LitroG = Km / KmL;
        float prec = LitroG * VComb;

        System.out.println("Você gatará " + LitroG + "L para percorrer essa distância\n");
        System.out.println("O preço a pagar pelo combustível: R$" + prec);

        teclado.close();
    }
    
}
