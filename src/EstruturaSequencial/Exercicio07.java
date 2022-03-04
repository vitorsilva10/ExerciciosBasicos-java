package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double peso;
        double emagrece;
        double engorda;


        System.out.println("Digite seu peso: ");
        peso = nc.nextDouble();



        engorda = peso + (peso / 100) * 15;

        emagrece = peso - (peso / 100) * 20;

        System.out.println("Se engordar 15% seu peso sera de : " + engorda);
        System.out.println("Se emagrecer 20% seu peso sera de : " + emagrece);


    }


}
