package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double area;
        double baseMaior;
        double baseMenor;
        double altura;

        System.out.println("Base Maior: ");
        baseMaior =nc.nextDouble();

        System.out.println("Base Menor: ");
        baseMenor =nc.nextDouble();

        System.out.println("Altura: ");
        altura =nc.nextDouble();

        area = ((baseMaior + baseMenor)*altura)/2;

            System.out.println("Valor da area do trapézio : "+area);

    }
}
