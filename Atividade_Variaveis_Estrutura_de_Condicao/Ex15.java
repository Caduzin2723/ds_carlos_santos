package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("\nDigite a quantidade de eleitores no município: ");
        int eleitores = teclado.nextInt();

        System.out.println("\nDigite a quantidade de votos em brancos: ");
        int brancos = teclado.nextInt();

        System.out.println("\nDigite a quantidade de votos nulos: ");
        int nulos = teclado.nextInt();

        System.out.println("\nDigite a quantidade de votos válidos: ");
        int validos = teclado.nextInt();
        //Input das informações necessárias

        double percentualbranco = brancos * 100 / eleitores; 
        double percentualNulo = nulos * 100 / eleitores;
        double percentualValido = validos * 100 / eleitores;
        //Fórmulas que transforma a quantidade de votos em percentual

        System.out.printf("\nOs percentuais de votos são: %nVálidos: %.2f%nBrancos: %.2f%nNulos: %.2f", percentualValido, percentualbranco, percentualNulo);

        teclado.close();
    }
    
}
