package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        double salarioFixo;
        double vendas;
        double comissao;
        double salarioFinal;

        System.out.println("Digite o Salario: ");
        salarioFixo = nc.nextDouble();

        System.out.println("Digite o valor das vendas: ");
        vendas = nc.nextDouble();

        comissao = (vendas / 100) * 4;

        salarioFinal = salarioFixo + comissao;

        System.out.println("Valor Comissão : " + comissao);
        System.out.println("Valor Salario Final : " + salarioFinal);

    }
}
