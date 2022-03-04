package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);
        double numero01;
        double numero02;
        double numero03;

        double multi;
        System.out.println("Digite um Numero: ");
        numero01 = nc.nextInt();

        System.out.println("Digite um Numero: ");
        numero02 = nc.nextInt();

        System.out.println("Digite um Numero: ");
        numero03 = nc.nextInt();

        multi = numero01 * numero02 * numero03;

        System.out.println("A multiplicação  dos números é : " + multi);


    }


}
