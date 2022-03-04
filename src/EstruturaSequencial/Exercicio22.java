package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio22 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        double anguloUm, anguloDois, anguloTres;

        System.out.println("Angulo 01: ");
        anguloUm = nc.nextDouble();

        System.out.println("Angulo 02: ");
        anguloDois = nc.nextDouble();

        anguloTres =  180 - (anguloUm - anguloDois);

        System.out.println("Angulo 03" + anguloTres);


    }


}
