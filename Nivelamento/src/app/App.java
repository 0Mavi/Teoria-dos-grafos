package app;

import java.util.Scanner;

import algoritmo.Distancia;
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

        switch (op) {
            case 1:
                break;
            case 2:
                Ui.valorQuadrado(sc);
                break;
            case 3:
                Ui.valorRetangulo(sc);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
          
        }

     

        sc.close();
       
    }
}
