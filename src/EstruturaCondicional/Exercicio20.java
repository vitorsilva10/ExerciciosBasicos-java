package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio20 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);


        int codigoOrigem, valor;
        String categoria;

        System.out.println("Digite Idade: ");
        codigoOrigem = nc.nextInt();

        if ( codigoOrigem == 1) {
            categoria = "Sul";
        } else if (codigoOrigem == 2) {
            categoria = "Norte";
        }  else if (codigoOrigem == 3) {
            categoria = "Leste";

        }  else if (codigoOrigem == 4) {
            categoria = "Oeste";

        }else categoria = "Categoria Senior";

        System.out.println(categoria);

    }

}


