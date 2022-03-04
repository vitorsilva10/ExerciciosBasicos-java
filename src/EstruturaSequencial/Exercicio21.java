package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio21 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        double numeroDeLados, numeroDiagonais;

        System.out.println("Distancia: ");
        numeroDeLados = nc.nextDouble();

        numeroDiagonais = numeroDeLados*(numeroDeLados-3)/2;

        System.out.println(" numero Diagonais " + numeroDiagonais);

    }





}
