package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        double preco, aumento;
        String resultado = "";

        System.out.println("Salario: ");
        preco = nc.nextDouble();


        if (preco <= 50) {
            aumento = (preco*5)/100;
            preco+=aumento;
        } else if (preco > 50 && preco < 100) {
            aumento = (preco * 10) / 100;
            preco += aumento;
        }else {
            aumento = (preco * 15) / 100;
            preco += aumento;
        }


        if (preco <= 80) {
            resultado = "Valor Final " + preco + " Este produto esta Barato";
        } else if (preco > 50 && preco <=120) {
            resultado = "Valor Final " + preco + " Este produto esta Normal";
        }else if (preco>120 && preco<=200){
            resultado = "Valor Final " + preco + " Este produto esta Caro";
        }else{
            resultado = "Valor Final " + preco + " Este produto esta Muito Caro";
        }

        System.out.println(resultado);

    }


}
