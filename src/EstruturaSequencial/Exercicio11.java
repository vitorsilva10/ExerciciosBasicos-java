package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        double area;
        double diagonalMenor;
        double diagonalMaior;


        System.out.println("Diagonal Maior: ");
        diagonalMenor =nc.nextDouble();

        System.out.println("Diagonal Menor: ");
        diagonalMaior =nc.nextDouble();


        area = (diagonalMenor*diagonalMaior)/2;

        System.out.println("Valor da area do losango : "+area);

    }


}
