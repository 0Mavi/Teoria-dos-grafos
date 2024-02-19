package app;

import java.util.Scanner;

public class Ui {
    
    public static int menuOpcao(Scanner sc) {
        System.out.println("""
                Escolha uma das opções:

                1 - Distancia de dois pontos
                2 - Área
                3 - Perímetro 
                """);

        return sc.nextInt();
    }

    public static int opcaoArea(Scanner sc) {
        System.out.println("""
                Escolha umas das figuras:
                
                1 - Triângulo
                2 - Quadrado
                3 - Retângulo
                4 - Paralelogramo
                5 - Losango
                6 - Trapézio
                7 - Círuculo
                """);

        return sc.nextInt();
    }

    public static void imprimirTraco(){
        System.out.println("-------------------------------------");
        System.out.println(" ");
    }
}
