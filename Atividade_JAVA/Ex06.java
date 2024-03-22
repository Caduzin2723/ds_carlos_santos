package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;
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

        float percentualbranco = brancos * 100f / eleitores; 
        float percentualNulo = nulos * 100f / eleitores;
        float percentualValido = validos * 100f / eleitores;

        //Fórmulas que transforma a quantidade de votos em percentual

        System.out.println("\n-------------\nCALCULANDO\n-------------");

        System.out.println("Percentagem de votos:\nVotos em Branco:" + percentualbranco + "%\nVotos Nulos: " + percentualNulo + "%\nVotos Válidos: " + percentualValido + "%\n");

        teclado.close();
    }
    
}
