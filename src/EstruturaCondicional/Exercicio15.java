package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio15 {


    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        float valor;
        byte op;
        System.out.println("Valor a investir : ");
        valor = nc.nextFloat();


        System.out.println("Investimento");
        System.out.println(" 1 - Poupança 3%");
        System.out.println(" 2 - Fundos de Renda Fixa 4%");

        System.out.println("Digite : ");
        op = nc.nextByte();

        switch (op){

            case 1:
                valor+=(valor*3)/100;
                System.out.println("Valor Corrigido: " + valor);
                break;

            case 2:
                valor+=(valor*4)/100;
                System.out.println("Valor Corrigido: " + valor);
                break;

            default:
                System.out.println("Opção Invalida");

        }


    }

}
