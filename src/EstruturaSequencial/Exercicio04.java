package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double nota1;
        double nota2;
        double peso1 = 2;
        double peso2 = 3;

        double media;
        System.out.println("Digite a Nota 1: ");
        nota1 = nc.nextInt();

        System.out.println("Digite a Nota 2: ");
        nota2 = nc.nextInt();

        media = ((nota1*peso1) + (nota2*peso2)) / (peso1+peso2);

        System.out.println("A Media dos números é : " + media);



    }


}
