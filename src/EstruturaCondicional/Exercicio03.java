package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);

        float x, y,maior,menor;
        String resultado;

        System.out.println("Numero 1 : ");
        x = nc.nextFloat();

        System.out.println("Numero 2 : ");
        y = nc.nextFloat();

        maior = (x>y)?x:y;
        menor = (x<y)?x:y;

        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
    }

}
