package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {



        Scanner nc = new Scanner(System.in);

        double qtdSalario;
        double valorSalario;
        double valorSalarioMinimo;


        System.out.println("Salario: ");
        valorSalario =nc.nextDouble();

        System.out.println("Salario Minimo: ");
        valorSalarioMinimo =nc.nextDouble();


        qtdSalario = valorSalario/ valorSalarioMinimo;

        System.out.println("Quantidade salario minimo : "+qtdSalario);

    }
}
