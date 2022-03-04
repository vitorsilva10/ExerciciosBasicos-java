package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);


        double dimensao1;
        double dimensao2;
        double area;
        double potenciaIluminacao;


        System.out.println("Dimenssão 01: ");
        dimensao1 = nc.nextDouble();

        System.out.println("Dimenssão 02: ");
        dimensao2 = nc.nextDouble();


        area = dimensao1*dimensao2;
        potenciaIluminacao = area*18;

        System.out.println("Area em m² : " + area);
        System.out.println("Potencia Iluminação: " + potenciaIluminacao + "W");

    }
}