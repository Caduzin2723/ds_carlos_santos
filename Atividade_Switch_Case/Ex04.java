package Atividade_Switch_Case;
//@author Carlos Santos
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite O código do lanche desejado:\n100-Cachorro quente - R$ 1,70 \n101- \n102- \n103- \n104- \n105- ");
    int cod_Lanche = teclado.nextInt();

    System.out.println("Digite quantos você vai comprar: ");
    int quant_Lanche = teclado.nextInt();

    teclado.close();
    }

}
