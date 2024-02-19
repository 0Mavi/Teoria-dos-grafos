package app;

import java.util.Scanner;

import algoritmo.Distancia;
import algoritmo.Area;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int op = Ui.menuOpcao(sc);

        Ui.imprimirTraco();

        switch (op) {
            case 1:
                System.out.println("Digite 4 valores:");
                int Xa = sc.nextInt();
                int Xb = sc.nextInt();
                int Ya = sc.nextInt();
                int Yb = sc.nextInt();
                System.out.println(Distancia.coordenada(Xa,Xb,Ya,Yb));
                break;
        
            default:
                break;
        }
       
    }
}
