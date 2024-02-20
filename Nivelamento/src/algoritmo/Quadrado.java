package algoritmo;

public class Quadrado implements Forma{

    
    private Double lado;

    public Quadrado() {
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double perimetro() {
        return lado * 4;
    }

    @Override
    public Double area() {
        return lado * lado;
    }
}

   

