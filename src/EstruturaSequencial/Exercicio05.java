package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);

        double valorProduto;
        double valorFinal;
        double desconto;
        System.out.println("Digite o valor: ");
        valorProduto = nc.nextDouble();

        desconto  = (valorProduto/100)*10;

        valorFinal = valorProduto - desconto;

        System.out.println("Valor com 10% de desconto : " + valorFinal);
    }


}
