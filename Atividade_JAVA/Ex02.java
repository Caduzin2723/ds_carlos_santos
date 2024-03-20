/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade_JAVA;

/**
 *
 * @author Carlos Santos
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1, b = 2, c = 0;

        System.out.println("O valor de A:" + a + "\nO valor de B:" + b);

        System.out.println("\n----------\nInvertendo os valores\n----------\n");

        c = b;
        b = a;
        a = c;

        // Código que inverte os valores utilizando  o auxiliar

        System.out.println("O novo valor de A:" + a + "\nO novo valor de B:" + b);
        }
    }
