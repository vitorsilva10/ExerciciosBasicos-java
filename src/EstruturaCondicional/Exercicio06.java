package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        double x, y, resultado,raiz1,raiz2;
        byte op;
        System.out.println("Numero 1 : ");
        x = nc.nextFloat();

        System.out.println("Numero 2 : ");
        y = nc.nextFloat();

        System.out.println("Opções");
        System.out.println(" 1 - O primeiro número elevado ao segundo número");
        System.out.println(" 2 - Raiz quadrada de cada um dos números");
        System.out.println(" 3 - Raiz cúbica de cada um dos números");


        System.out.println("Digite : ");
        op = nc.nextByte();

        switch (op) {

            case 1:
                resultado = Math.pow(x,y);
                System.out.println(resultado);
                break;

            case 2:
                raiz1 = Math.sqrt(x);
                raiz2 = Math.sqrt(y);
                System.out.println(raiz1);
                System.out.println(raiz2);
                break;

            case 3:
                raiz1 = Math.cbrt(x);
                raiz2 = Math.cbrt(y);
                System.out.println(raiz1);
                System.out.println(raiz2);
                break;

            default:
                System.out.println("Opção Invalida");

        }

    }



}
