package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);



        double horasTrabalhadas ,
                horasExtra,
                salarioMinimo,
                valorHrTrabalhada ,
                valorHrExtra,
                salarioBruto,
                valorExtra,
                salarioReceber;


        System.out.println("Horas Trabalhadas: ");
        horasTrabalhadas = nc.nextDouble();

        System.out.println("Salario Minimo: ");
        salarioMinimo =nc.nextDouble();

        System.out.println("Hora Extra: ");
        horasExtra = nc.nextDouble();


        valorHrTrabalhada = salarioMinimo/8;
        valorHrExtra = salarioMinimo/4;
        salarioBruto = horasTrabalhadas*valorHrTrabalhada;
        valorExtra = horasExtra*valorHrExtra;
        salarioReceber = + salarioBruto + valorExtra;


        System.out.println("Salario a receber " + salarioReceber);



    }


}
