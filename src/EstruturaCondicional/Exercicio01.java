package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;
        String resultado;
        System.out.println("Nota 1 : ");
        nota1 = nc.nextInt();

        System.out.println("Nota 2 : ");
        nota2 = nc.nextInt();

        System.out.println("Nota 3 : ");
        nota3 = nc.nextInt();

        System.out.println("Nota 4 : ");
        nota4 = nc.nextInt();

        media = (nota1 + nota2 + nota3 + nota4)/4;

       resultado = (media<7) ? "Reprovado" : "Aprovado";

        System.out.println(resultado);

    }






}
