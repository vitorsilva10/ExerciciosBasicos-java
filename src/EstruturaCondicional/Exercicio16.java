package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {


        Scanner nc = new Scanner(System.in);


        String senha;
        String password = "4531";
        String resultado;
        System.out.println("Senha : ");
        senha = nc.next();

        resultado = (senha.equalsIgnoreCase(password))? "Acesso Permitido" : "Acesso Negado";

        System.out.println(resultado);


    }

}
