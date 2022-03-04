package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);


        float horas, minutos, converteMinuto, converteSegundos;

        System.out.println("Hora: ");
        horas = nc.nextFloat();

        System.out.println("Minutos : ");
        minutos = nc.nextFloat();


        converteMinuto = horas*60;
        minutos+=converteMinuto;
        converteSegundos = minutos*60;

        System.out.println("Horas em minutos " + converteMinuto);
        System.out.println("Minutos total " + minutos);
        System.out.println("Total segundos " + converteSegundos);


    }


}
