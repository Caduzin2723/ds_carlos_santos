package Orientacao_Objetos;
//@author Carlos Santos
import java.util.Random;

public class Classe_carro {
    public static void main(String[] args) {
        // instanciar a Classe Carro
        Carro car = new Carro();
        car.nome = "Civic";
        car.marca = "Honda";
        car.ano = 2018;
        car.vel = 60;
        car.sensor = false;
         
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        // Verificando se o número gerado é par
        if (numeroAleatorio % 2 == 0) {
            car.sensor = true;
        } else {
            car.sensor = false;
        }
        
        }
    }