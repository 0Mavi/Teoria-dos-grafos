package algoritmo;

public class Paralelogramo implements Forma {

    private Double ladoA;
    private Double ladoB;
    private Double base;

    public Paralelogramo(){ 
    }

    public Paralelogramo(Double ladoA,Double ladoB,Double base) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.base = base;
        
    }

    
    @Override
    public Double perimetro() {
        return (2 * ladoA) + (2 * ladoB);
    }

    @Override
    public Double area() {
        return ladoA * base;
    }


    public Double getLadoA() {
        return ladoA;
    }

   
    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    
    public Double getLadoB() {
        return ladoB;
    }

    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

}
