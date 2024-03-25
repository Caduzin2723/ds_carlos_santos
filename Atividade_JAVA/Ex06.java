package Atividade_JAVA;
import java.text.DecimalFormat;
//@author Carlos Santos
import java.util.Scanner;
import java.text.NumberFormat;
public class Ex06 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de eleitores no município: ");
        int eleitores = teclado.nextInt();

        System.out.println("Digite a quantidade de votos em brancos: ");
        int brancos = teclado.nextInt();

        System.out.println("Digite a quantidade de votos nulos: ");
        int nulos = teclado.nextInt();

        System.out.println("Digite a quantidade de votos válidos: ");
        int validos = teclado.nextInt();

        //Input das informações necessárias

        float percentualbranco = brancos * 100 / eleitores; 
        float percentualNulo = nulos * 100 / eleitores;
        float percentualValido = validos * 100 / eleitores;

        //Fórmulas que transforma a quantidade de votos em percentual

        System.out.println("\n-------------\nCALCULANDO\n-------------");

        System.out.println("Percentual de votos em Brancos: " + new DecimalFormat("##.##").format(percentualbranco));
        System.out.printf("Percentual de votos Nulos: %.2f" + percentualNulo);
        System.out.println("Percentual de votos Válidos: " + new DecimalFormat("##.##").format(percentualValido));
        teclado.close();
    }
    
}
