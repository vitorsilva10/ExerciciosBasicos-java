package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        double area;
        double lado;

        System.out.println("Lado: ");
        lado =nc.nextDouble();

        area = Math.pow(lado,2);

        System.out.println("Valor da area do Quadrado : "+area);

    }

}
