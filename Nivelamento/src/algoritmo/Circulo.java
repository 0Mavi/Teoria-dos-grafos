package algoritmo;

public class Circulo implements Forma {
     
    private Double raio;

    public Circulo() {
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    
    @Override
    public Double perimetro() {
        return 2 * 3.14 * raio;
    }

    @Override
    public Double area() {
        return Math.pow(3.14 * raio, 2);
    }

    /**
     * @return Double return the raio
     */
    public Double getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(Double raio) {
        this.raio = raio;
    }

}
