package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);


        double catetoOposto;
        double catetoAdjacente;
        double hipotenusa;

        System.out.println("Digite o Cateto Oposto: ");
        catetoOposto = nc.nextDouble();

        System.out.println("Digite Adjacente: ");
        catetoAdjacente = nc.nextDouble();

        hipotenusa = Math.pow(catetoOposto,2) + Math.pow(catetoAdjacente,2);

        System.out.println("Salario Atual : " + Math.sqrt(hipotenusa));

    }


}
