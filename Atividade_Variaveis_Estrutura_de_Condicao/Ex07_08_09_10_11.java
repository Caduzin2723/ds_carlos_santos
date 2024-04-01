package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex07_08_09_10_11 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a distância que seu carro percorre com 1 litro de combusto(em Km)?");
        float kiloMetroPorLitro = teclado.nextFloat();

        System.out.println("Qual a distância você vai percorrer?");
        float kiloMetro = teclado.nextFloat();

        System.out.println("Qual o preço uniário do combustível?");
        float valorCombustivel = teclado.nextFloat();
        //Input das informações necessárias

        float litroGasto = kiloMetro / kiloMetroPorLitro; //Fórmula para descobrir quantos litros vai gastar no percurso

        float precoPagar = litroGasto * valorCombustivel; //Fórmula para descobrir o valor gasto pelo combustível

        System.out.printf("%nVocê gatará %.2f L para percorrer essa distância%n", litroGasto);
        System.out.printf("%nO preço a pagar pelo combustível: R$%.2f", precoPagar);

        teclado.close();
    }

}