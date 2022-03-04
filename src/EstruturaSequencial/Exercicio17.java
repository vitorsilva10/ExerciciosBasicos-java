package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);


        double raio;
        double comprimento;
        double area;
        double volume;

        System.out.println("Digite o Raio: ");
        raio = nc.nextDouble();


        comprimento = 2* Math.PI*raio;
        area = Math.PI*Math.pow(raio,2);
        volume = 4 *Math.PI * Math.pow(raio,3)/3;


        System.out.printf("Comprimento: %.2f", comprimento);
        System.out.printf(" | Area: %.2f", area);
        System.out.printf(" | Volume %.2f", volume);


    }


}
