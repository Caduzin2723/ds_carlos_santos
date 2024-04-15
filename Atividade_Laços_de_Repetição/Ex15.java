package Atividade_Laços_de_Repetição;
//@author Carlos Santos

public class Ex15 {
    public static void main(String[] args) {

        
        int n = 99;
        
        int a = 0;
        int b = 1;
        int c;
        
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");
        
        if (n >= 1) {
            System.out.print(a + " ");
        }
        
        if (n >= 2) {
            System.out.print(b + " ");
        }
        
        int i = 3;
        while (i <= n) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}