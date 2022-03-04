package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        double peso;
        double pesoEmGrama;

        System.out.println("Digite um Numero: ");
        peso = nc.nextDouble();

        pesoEmGrama = peso*1000;


        System.out.println("Seu peso em grama é : " + pesoEmGrama);


    }


}
