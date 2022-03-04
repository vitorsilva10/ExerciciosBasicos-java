package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        float x, y, media, diferenca, produto, divisao;
        byte op;
        System.out.println("Numero 1 : ");
        x = nc.nextFloat();

        System.out.println("Numero 2 : ");
        y = nc.nextFloat();

        System.out.println("Opções");
        System.out.println(" 1 - Média entre os números digitado ");
        System.out.println(" 2 - Diferença do maior pelo menor ");
        System.out.println(" 3 - Produto entre os números digitados ");
        System.out.println(" 4 - Divisão do primeiro pelo segundo");

        System.out.println("Digite : ");
        op = nc.nextByte();

        switch (op){

            case 1: media = x + y / 2;
                System.out.println(media);
                break;

            case 2: diferenca = x - y;
                System.out.println(diferenca);
                break;

            case 3: produto = x * y;
                System.out.println(produto);
                break;

            case 4:
                if (x!=0){
                    divisao = x / y;
                    System.out.println(divisao);
                }else
                    System.out.println("numero deve ser maior que zero");
                break;

            default:
                System.out.println("Opção Invalida");

        }



    }

}
