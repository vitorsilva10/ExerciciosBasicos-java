package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double custo, valorConsumidor, distribuidor, imposto;
        String resultado;

        System.out.println("Custo Fabrica: ");
        custo = nc.nextDouble();


        if (custo<=12000){
            valorConsumidor =  custo + ((custo*05)/100);
            resultado = "Valor Final " + valorConsumidor;
        }else if (custo >=12000 && custo <=25000){
            distribuidor =  ((custo*10)/100);
            imposto = ((custo*15)/100);
            valorConsumidor = custo + distribuidor + imposto;
            resultado = "Valor Final " + valorConsumidor;
        }else{
            distribuidor =  (custo*15)/100;
            imposto = (custo*20)/100;
            valorConsumidor = custo + distribuidor + imposto;
            resultado = "Valor Final " + valorConsumidor;
        }

        System.out.println(resultado);

    }
}



