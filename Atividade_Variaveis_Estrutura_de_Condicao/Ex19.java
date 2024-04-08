package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu salário fixo R$: ");
        double salario = teclado.nextDouble();

        teclado.nextLine();

        System.out.println("Digite quantos carros você vendeu: ");
        @SuppressWarnings("unused")
        String carros = teclado.nextLine();

        System.out.println("Digite qual o total das suas vendas: R$ ");
        double vendas = teclado.nextDouble();
        //Input das informações necessárias

        double salarioFinal = salario + (5f / 100f * vendas); //Fórmula para somar o salário com os 5% das vendas

        System.out.printf("\nSeu salário final é de R$%.2f", salarioFinal);

        teclado.close();
    }
    
}