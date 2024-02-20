package app;

import java.util.Scanner;

import algoritmo.Distancia;
import algoritmo.Forma;
import algoritmo.Quadrado;

public class Ui {


    
    public static int menuOpcao(Scanner sc) {
        System.out.println("""
                Escolha uma das opções:

                1 - Distancia de dois pontos
                2 - Área e Perímetro
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

    public static double valorXeY(Scanner sc){

        System.out.println("Digite 4 valores:");
        int Xa = sc.nextInt();
        int Xb = sc.nextInt();
        int Ya = sc.nextInt();
        int Yb = sc.nextInt();

        return Distancia.coordenada(Xa, Xb, Ya, Yb);
    }


    public static void imprimirTraco(){
        System.out.println("-------------------------------------");
        System.out.println(" ");
    }

  

    public static Forma valorQuadrado(Scanner sc){

        Forma forma;

        System.out.println("Digite o valor do lado: ");
        double lado = sc.nextDouble();
        forma = new Quadrado(lado);

        return forma;
    }
}
