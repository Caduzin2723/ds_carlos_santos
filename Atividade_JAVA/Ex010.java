package Atividade_JAVA;
//@author Carlos Santos
import java.util.Scanner;
public class Ex010 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite sua altura(metros): ");
        float altura = teclado.nextFloat();

        System.out.println("Digite seu sexo (M/F): ");
        String sexo = teclado.nextLine();

        //Input das informações necessárias

        if(sexo == "M"){
            float pesoIdeal = (72.7f * altura) - 58f; //Fórmula para calcular o peso ideal

            System.out.println("\nSeu peso ideal é: " + pesoIdeal + "Kg");
        }
        else{
            float pesoIdeal = (62.1f * altura) - 58f; //Fórmula para calcular o peso ideal

            System.out.println("\nSeu peso ideal é: " + pesoIdeal + "Kg");
        }
        
        teclado.close();
        }

    }
