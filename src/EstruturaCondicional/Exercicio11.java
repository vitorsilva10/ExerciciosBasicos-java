package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio11 {


    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double salario, percentualAumento,salariofinal;
        String resultado = "";

        System.out.println("Salario: ");
        salario = nc.nextDouble();


        if (salario < 300) {
            percentualAumento = (salario * 15) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;
        } else if (salario >= 300 && salario < 600) {
            percentualAumento = (salario * 10) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;
        } else if (salario >=600 && salario<900){
            percentualAumento = (salario * 05) / 100;
            salariofinal = salario + percentualAumento;
            resultado = "Valor Final " + salariofinal;
        }else{
            System.out.println("Aumento não autorizado");
        }

        System.out.println(resultado);


    }
}
