package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {

    //Faça um programa que receba ois n

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double numeroUm;
        double numeroDois;
        double soma;
        System.out.println("Digite um Numero: ");
        numeroUm = nc.nextInt();

        System.out.println("Digite um Numero: ");
        numeroDois = nc.nextInt();

        soma = numeroUm + numeroDois;

        System.out.println("A soma dos números é : " + soma);

    }


}
