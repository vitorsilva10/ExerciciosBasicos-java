package EstruturaCondicional;

import java.util.Scanner;

public class Exercico23 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);


        int codigo, quantidade;
        double preco = 0, precoUnitario, valorNota = 0, desconto = 0;
        String categoria;

        System.out.println("Digite codigo: ");
        codigo = nc.nextInt();

        System.out.println("Digite quantidade: ");
        quantidade = nc.nextInt();

        if (codigo>=1 && codigo<=10){
            preco = 10;
            valorNota = preco * quantidade;

        }else if (codigo>=11 && codigo<=20){
            preco = 15;
            valorNota = preco * quantidade;

        }else if (codigo>=21 && codigo<=30){
            preco = 20;
            valorNota = preco * quantidade;

        }else if (codigo>=31 && codigo<=40){
            preco = 30;
            valorNota = preco * quantidade;
        }else{
            System.out.println("Codigo Invalido");;
        }

        if (valorNota<250){
            desconto =  (valorNota*5)/100;
            valorNota-=desconto;
        }else if (valorNota >=250 && valorNota<=500){
            desconto =  (valorNota*10)/100;
            valorNota-=desconto;
        }else if (valorNota>500){
            desconto =  (valorNota*15)/100;
            valorNota-=desconto;
        }

        System.out.println("Valor Unitario : " + preco);
        System.out.println("Valor Desconto Nota : " + desconto);
        System.out.println("Valor Total Nota : " + valorNota);
    }


}
