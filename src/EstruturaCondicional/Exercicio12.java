package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {


            Scanner nc = new Scanner(System.in);

            double salario, desconto, salariofinal,gratificacao;
            String resultado = "";

            System.out.println("Salario: ");
            salario = nc.nextDouble();


            desconto = (salario * 7)/100;

            if (salario <= 350) {
                gratificacao = 100;
                salariofinal = (salario-desconto) + gratificacao;
                resultado = "Valor Final " + salariofinal;
            } else if (salario >= 350 && salario < 600) {
                gratificacao = 75;
                salariofinal = (salario-desconto) + gratificacao;
                resultado = "Valor Final " + salariofinal;
            } else if (salario >= 600 && salario < 900) {
                gratificacao = 50;
                salariofinal = (salario-desconto) + gratificacao;
                resultado = "Valor Final " + salariofinal;
            } else {
                gratificacao = 35;
                salariofinal = (salario-desconto) + gratificacao;
                resultado = "Valor Final " + salariofinal;
            }

            System.out.println(resultado);


    }

}
