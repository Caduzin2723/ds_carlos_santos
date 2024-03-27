package Atividade_JAVA;
    //@author Carlos Santos
    import java.util.Scanner;
public class Ex07 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu salário atual(R$): ");
        float salario = teclado.nextFloat();

        System.out.println("Digite o percentual de reajuste(%): ");
        float reajuste = teclado.nextFloat();

        //Input das informações necessárias

        float novoSalario = salario + (reajuste / 100f * salario); //Fórmula para aumentar o salário com base no percentual do reajuste

        System.out.println("\nSeu novo salário : R$" + novoSalario);

        teclado.close();
        }

}
