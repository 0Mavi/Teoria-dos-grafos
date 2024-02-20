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
                break;
        }

        op = Ui.opcaoArea(sc);
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
                break;
            case 7:
                break;
            default:
                break;
          
        }


        System.out.println(forma.area());
        System.out.println(forma.perimetro());
     

        sc.close();
       
    }
}
