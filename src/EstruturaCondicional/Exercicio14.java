package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double salario, percentualAumento, salariofinal;
        String resultado = "";

        System.out.println("Salario: ");
        salario = nc.nextDouble();


        if (salario < 300) {
            percentualAumento = (salario * 50) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;
        } else if (salario >= 300 && salario < 500) {
            percentualAumento = (salario * 40) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;
        } else if (salario >= 500 && salario < 700) {
            percentualAumento = (salario * 30) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;
        }else if (salario >= 700 && salario < 800) {
            percentualAumento = (salario * 20) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;
        }else if (salario >= 800 && salario < 1000) {
            percentualAumento = (salario * 10) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;
        }else {
            percentualAumento = (salario * 5) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;;
        }

        System.out.println(resultado);

    }


}
