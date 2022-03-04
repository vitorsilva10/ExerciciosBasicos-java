package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio07 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        float salario;

        System.out.println("Salario : ");
        salario = nc.nextFloat();

        if (salario<500){
            salario+=salario*30/100;
            System.out.println("Parabens , seu salario atual será de " + salario);
        }else{
            System.out.println("Você não tem direito ao aumento");
        }

    }


}
