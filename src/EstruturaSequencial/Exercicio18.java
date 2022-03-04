package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);


        double celsius;
        double fahrenheit;

        System.out.println("Celsius: ");
        celsius = nc.nextDouble();

        fahrenheit = celsius * 1.8 + 32;

        System.out.printf("Temperatura em fahrenheit : %.2f", fahrenheit);

    }


}
