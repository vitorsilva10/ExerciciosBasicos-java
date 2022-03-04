package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

            Scanner nc = new Scanner(System.in);


            int codigoOrigem, valor;
            String categoria;

            System.out.println("Digite codigo: ");
            codigoOrigem = nc.nextInt();

            System.out.println("Digite codigo: ");
            valor = nc.nextInt();

            if ( codigoOrigem == 1) {
                categoria = "Sul";
            } else if (codigoOrigem == 2) {
                categoria = "Norte";
            }  else if (codigoOrigem == 3) {
                categoria = "Leste";

            }  else if (codigoOrigem == 4) {
                categoria = "Oeste";

            } else if (codigoOrigem == 5 || codigoOrigem ==6) {
                categoria = "Nordeste";

            }else if (codigoOrigem == 7 || codigoOrigem == 8 || codigoOrigem == 9) {
                categoria = "Sudeste";

            }else if (codigoOrigem >= 10 && codigoOrigem <=20) {
                categoria = "Centro-Oeste";
            }else if (codigoOrigem > 20 && codigoOrigem <=30) {
                categoria = "Nordeste";
            }
            else categoria = "Origem Invalida";

            System.out.println(categoria + " "+ valor);


        }


}
