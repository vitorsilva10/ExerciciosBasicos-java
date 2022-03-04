package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio08 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        float salario;

        System.out.println("Salario : ");
        salario = nc.nextFloat();

        if (salario <= 300) {
            salario += salario * 35 / 100;
            System.out.println("Parabens , seu salario atual será de " + salario);
        } else {
            salario += salario * 15 / 100;
            System.out.println("Parabens , seu salario atual será de " + salario);
        }

    }


}
