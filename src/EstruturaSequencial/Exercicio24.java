package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double valor;

        double dolar;
        double marcoAlemao;
        double libra;


        System.out.println("Valor em Real: ");
        valor =nc.nextInt();

        dolar = valor/1.80;
        marcoAlemao = valor/2;
        libra = valor/1.57;

        System.out.printf("Dolar %.2f", dolar);
        System.out.println();
        System.out.println("Marco Alemão " + marcoAlemao);
        System.out.printf("Libra %.2f", libra);

    }


}
