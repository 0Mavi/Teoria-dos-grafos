package app;

import java.util.Scanner;

import algoritmo.Distancia;
import algoritmo.Forma;
import algoritmo.Losango;
import algoritmo.Paralelogramo;
import algoritmo.Quadrado;
import algoritmo.Retangulo;
import algoritmo.Trapezio;
import algoritmo.Triangulo;


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

    public static Forma valorTriangulo(Scanner sc){

        Forma forma;

        System.out.println("Digite o valor do lado a: ");
        double ladoA = sc.nextDouble();
        System.out.println("Digite o valor do lado b: ");
        double ladoB = sc.nextDouble();
        System.out.println("Digite o valor do lado c: ");
        double ladoC = sc.nextDouble();
        System.out.println("Digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        return forma = new Triangulo(ladoA,ladoB,ladoC,base,altura);
    }

    public static Forma valorQuadrado(Scanner sc){

        Forma forma;

        System.out.println("Digite o valor do lado: ");
        double lado = sc.nextDouble();

        return forma = new Quadrado(lado);

    }

    public static Forma valorRetangulo(Scanner sc){
         
        Forma forma;

        System.out.println("Digite o valor da base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        return forma = new Retangulo(base,altura);
    }

    public static Forma valorParalelogramo(Scanner sc){
         
        Forma forma;

        System.out.println("Digite o valor do lado a: ");
        double ladoA = sc.nextDouble();
        System.out.println("Digite o valor do lado b: ");
        double ladoB = sc.nextDouble();
        System.out.println("Digite o valor da base: ");
        double base = sc.nextDouble();

        return forma = new Paralelogramo(ladoA,ladoB,base);

    }

    public static Forma valorLosango(Scanner sc){
         
        Forma forma;

        System.out.println("Digite o valor do lado: ");
        double lado = sc.nextDouble();
        System.out.println("Digite o valor da diagonal maior: ");
        double diagonalMa = sc.nextDouble();
        System.out.println("Digite o valor da diagonal menor: ");
        double diagonalMe = sc.nextDouble();

        return forma = new Losango(lado,diagonalMa,diagonalMe);

    }

    public static Forma valorTrapezio (Scanner sc){
        Forma forma;

        System.out.println("Digite o valor da base maior: ");
        double baseMa = sc.nextDouble();
        System.out.println("Digite o valor da base menor: ");
        double baseMe = sc.nextDouble();
        System.out.println("Digite o valor do lado a: ");
        double ladoA = sc.nextDouble();
        System.out.println("Digite o valor do lado c: ");
        double ladoC = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        return forma = new Trapezio(ladoA, baseMe, ladoC, baseMa, altura);
    }
}
