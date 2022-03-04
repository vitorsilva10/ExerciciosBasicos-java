package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        double salario;
        double conta1;
        double conta2;
        double valorDescontado;
        double valorMulta;

        System.out.println("Digite o salario: ");
        salario = nc.nextDouble();

        System.out.println("Valor conta 01: ");
        conta1 = nc.nextDouble();

        System.out.println("Valor conta 02: ");
        conta2 = nc.nextDouble();

        valorMulta = ((conta1/100)*2) + ((conta2/100)*2);
        valorDescontado = conta1 + conta2 + valorMulta;

        salario-=valorDescontado;

        System.out.println("Salario Atual : " + salario);

    }



}
