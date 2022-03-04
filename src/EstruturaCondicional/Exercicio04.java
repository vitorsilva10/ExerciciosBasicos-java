package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {


    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        float x, y,z, maior,menor;
        String resultado;

        System.out.println("Numero 1 : ");
        x = nc.nextFloat();

        System.out.println("Numero 2 : ");
        y = nc.nextFloat();

        System.out.println("Numero 3 : ");
        z = nc.nextFloat();


        if (x>y && x>z){
            resultado = "Maior : " + x;
        }else if (y>x && y>z){
            resultado = "Maior : " + y;
        }else if (z>x && z<y){
            resultado = "Maior : " + z;
        }else{
            resultado = "Os números são iguais";
        }

        System.out.println(resultado);

    }

}
