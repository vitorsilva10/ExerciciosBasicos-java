package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio22 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);


        int idade;
        double peso;
        String categoria;

        System.out.println("Digite codigo: ");
        idade = nc.nextInt();

        System.out.println("Digite Peso: ");
        peso = nc.nextDouble();

        if (idade<20){

            if (peso<60){
                categoria = "Grupo de Risco 9";
            }else if (peso>=60 && peso <=90){
                categoria = "Grupo de Risco 8";
            }else{
                categoria = "Grupo de Risco 7";
            }

        }else if (idade>20 && idade<=50){

            if (peso<60){
                categoria = "Grupo de Risco 6";
            }else if (peso>=60 && peso <=90){
                categoria = "Grupo de Risco 5";
            }else{
                categoria = "Grupo de Risco 4";
            }

        }else{
            if (peso<60){
                categoria = "Grupo de Risco 3";
            }else if (peso>=60 && peso <=90){
                categoria = "Grupo de Risco 2";
            }else{
                categoria = "Grupo de Risco 1";
            }
        }

        System.out.println(categoria);


    }


}
