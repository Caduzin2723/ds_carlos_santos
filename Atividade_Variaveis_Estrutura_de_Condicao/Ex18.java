package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de fabrica do carro desejado: ");
        float valorFabrica = teclado.nextFloat();
        //Input das informações necessárias

        float valorFinal = valorFabrica + ((28f / 100f * valorFabrica) + (45f / 100f * valorFabrica)); //Fórmula para adicionas os 28% do fabbricante e 45% dos impostos

        System.out.printf("\nO valor final do carro com o percentual do distribuidor(28%) e os impostos(45%) ficará em: R$$.2f", valorFinal);

        teclado.close();
    }    
    
}
