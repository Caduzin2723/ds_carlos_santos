package Atividade_Laços_de_Repetição;
//@author Carlos Santos

public class Ex16 {
    public static void main(String[] args) {
    
        int a = 1, b = 0, c = 0, i = 1;

        System.out.printf("%n%d° termo = %d", i, b);
        
        while(c < 377){
            i++;
            c = a + b;
            System.out.printf("%n%d° termo = %d", i, c);
            a = b;
            b = c;
        }

    }

}
