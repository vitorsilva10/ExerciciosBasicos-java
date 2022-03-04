package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        float nota1, nota2, media;
        String resultado;

        System.out.println("Nota 1 : ");
        nota1 = nc.nextInt();

        System.out.println("Nota 2 : ");
        nota2 = nc.nextInt();

        media = (nota1 + nota2) / 2;

        if (media>=0 &&  media<3){

            resultado = "Reprovado, sua Media: " + media;
        }else if (media >=4 && media <7){

            resultado = "Exame, sua Media: "+ media;
        }else if(media>=7 && media<=10){

            resultado = "Aprovado, sua Media:" + media;
        }else{
            resultado =  "Nota invalida";
        }

        System.out.println(resultado);

    }
}
