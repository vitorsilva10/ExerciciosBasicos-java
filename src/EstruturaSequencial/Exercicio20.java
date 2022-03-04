package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double angulo, distancia, escada , radiano;

        System.out.println("Distancia: ");
        distancia = nc.nextDouble();

        System.out.println("angulo: ");
        angulo = nc.nextDouble();

        radiano = angulo * Math.PI/180;
        escada = distancia/radiano;

        System.out.printf("Distancia escada : %.2f", escada);

    }

}
