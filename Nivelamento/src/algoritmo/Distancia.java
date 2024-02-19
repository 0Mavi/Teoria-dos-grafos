package algoritmo;

public class Distancia {

    public static double coordenada(int Xa, int Xb, int Ya, int Yb){
        int resultado = (int) Math.sqrt(Math.pow(Xb - Xa, 2) + Math.pow(Yb - Ya, 2));
        return resultado;
    }
}
