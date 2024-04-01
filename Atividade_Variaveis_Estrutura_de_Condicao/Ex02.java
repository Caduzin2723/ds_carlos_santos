package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Qual a distância percorrida pelo seu veículo(Km): ");
    float distancia = teclado.nextFloat();

    System.out.println("Quanto de combustível foi gasto(L): ");
    float combustivel = teclado.nextFloat();
    //Input das informações necessária

    System.out.printf("%nA média do seu gasto foi de %.2fKm/L%n", distancia/combustivel);
    teclado.close();
    }
}