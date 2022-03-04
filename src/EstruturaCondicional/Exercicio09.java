package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {



        Scanner nc = new Scanner(System.in);

        float saldoMedio, credito;
        String resultado;

        System.out.println("Saldo Medio: ");
        saldoMedio = nc.nextFloat();


        if (saldoMedio>400){
            credito = saldoMedio*30/100;
            resultado = "Saldo Credito de " + credito;
        }else if (saldoMedio <=400 && saldoMedio >=300){
            credito = saldoMedio*25/100;
            resultado = "Saldo Credito de " + credito;
        }else if(saldoMedio<=300 && saldoMedio>=200){
            credito = saldoMedio*20/100;
            resultado = "Saldo Credito de " + credito;
        }else{
            credito = saldoMedio*10/100;
            resultado = "Saldo Credito de " + credito;
        }

        System.out.println(resultado);


    }


}
