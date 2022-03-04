package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio14 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        int anoNascimento;
        int anoAtual;

        int anos;
        int meses;
        int dias;
        int semanas;


        System.out.println("Ano Nascimento: ");
        anoNascimento =nc.nextInt();

        System.out.println("Ano atual: ");
        anoAtual =nc.nextInt();

        anos = anoAtual - anoNascimento;
        meses = anos * 12;
        dias = anos*365;
        semanas = dias/7;

        System.out.println("Anos " + anos);
        System.out.println("Meses " + meses);
        System.out.println("Dias " + dias);
        System.out.println("Semanas " + semanas);


    }

}
