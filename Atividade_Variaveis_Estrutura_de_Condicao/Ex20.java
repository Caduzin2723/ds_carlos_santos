package Atividade_Variaveis_Estrutura_de_Condicao;
//@author Carlos Santos
import java.util.Scanner;
public class Ex20 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite sua altura(metros): ");
        double altura = teclado.nextDouble();

        System.out.println("Digite seu sexo (M/F): ");
        char sexo = teclado.next().charAt(0);
        //Input das informações necessárias

        double pesoIdeal = 0;
        if (sexo == 'M' || sexo == 'm') {
             pesoIdeal = (72.7f * altura) - 58f; //Fórmula para calcular o peso ideal
        } else if (sexo == 'F' || sexo == 'f'){
             pesoIdeal = (62.1f * altura) - 44.7f; //Fórmula para calcular o peso ideal
        } else{
            System.out.println("Sexo inválido");
        }

        System.out.printf("O peso ideal para %s é %.2fkg%n", nome, pesoIdeal);
        
        teclado.close();
        }

    }