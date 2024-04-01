package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex16_17 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu salário atual(R$): ");
        float salario = teclado.nextFloat();

        System.out.println("Digite o percentual de reajuste(%): ");
        float reajuste = teclado.nextFloat();
        //Input das informações necessárias

        float novoSalario = salario + (reajuste / 100f * salario); //Fórmula para aumentar o salário com base no percentual do reajuste

        System.out.printf("\nSeu novo salário : R$%.2f", novoSalario);

        teclado.close();
        }

}
