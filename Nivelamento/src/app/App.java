package app;

import java.util.Scanner;

import algoritmo.Forma;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int op = Ui.menuOpcao(sc);
       
        Ui.imprimirTraco();
     

        switch (op) {
            case 1:
                System.out.printf("%.2f",Ui.valorXeY(sc));
                break;

            case 2:
                break;

            default:
                System.out.println("Adios!");
                System.exit(0);
                break;
        }

        op = Ui.opcaoArea(sc);
        System.out.println("");
        Forma forma = null;
      

        switch (op) {
            case 1:
                forma = Ui.valorTriangulo(sc);
                break;
            case 2:
                forma = Ui.valorQuadrado(sc);
                break;
            case 3:
                forma = Ui.valorRetangulo(sc);
                break;
            case 4:
                forma = Ui.valorParalelogramo(sc);
                break;
            case 5:
                forma = Ui.valorLosango(sc);
                break;
            case 6:
                forma = Ui.valorTrapezio(sc);
                break;
            case 7:
                forma = Ui.valorCirculo(sc);
                break;
            default:
                System.out.println("Adios!");
                forma = null;
                System.exit(0);
                break;
          
        }



        Ui.imprimirTraco();
        System.out.println("Area: " + forma.area());
        System.out.println("Perimetro: " + forma.perimetro());
     

        sc.close();
       
    }
}
