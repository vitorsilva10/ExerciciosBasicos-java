package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {




        Scanner nc = new Scanner(System.in);

        int tabuada;

        System.out.println("Digite a tabuada: ");
        tabuada =nc.nextInt();


        for (int i =1; i<=10;i++){
            System.out.println( "Tabuada " + tabuada + " x "+ i + " = " + tabuada*i);
        }


    }


}



