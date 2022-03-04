package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        String resultado;
        int idade;

        System.out.println("Digite Idade: ");
        idade = nc.nextInt();

        resultado = (idade>=18)? "Maior de Idade" : "Menor de Idade";

        System.out.println(resultado);


    }

}
