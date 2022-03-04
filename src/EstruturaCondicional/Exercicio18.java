package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio18 {


    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double altura, peso;
        String op;

        System.out.println("Altura : ");
        altura = nc.nextDouble();


        System.out.println("Sexo");
        System.out.println(" M - Masculino");
        System.out.println(" F - Feminino");

        System.out.println("Digite : ");
         op = nc.next();

        switch (op){

            case "M":
                peso = (72.7*altura)-58;
                System.out.printf("Peso Ideal: %.2f", peso);
                break;

            case "F":
                peso = (62.1*altura)-44.7;
                System.out.printf("Peso Ideal: %.2f", peso);
                break;

            default:
                System.out.println("Opção Invalida");

        }


    }

}
