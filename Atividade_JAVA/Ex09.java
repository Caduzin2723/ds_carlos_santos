package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu salário fixo: R$");
        float salario = teclado.nextFloat();

        System.out.println("Digite quantos carros você vendeu: ");
        String carros = teclado.nextLine();

        System.out.println("Digite qual o total das suas vendas: R$ ");
        float vendas = teclado.nextFloat();

        //Input das informações necessárias

        float salarioFinal = salario + (5f / 100f * vendas); //Fórmula para somar o salário com os 5% das vendas

        System.out.println("\nSeu salário final é de R$" + salarioFinal);

        teclado.close();
    }
    
}
