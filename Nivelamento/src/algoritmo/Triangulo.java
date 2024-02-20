package algoritmo;

public class Triangulo implements Forma{

    private Double ladoA;
    private Double ladoB;
    private Double ladoC;
    private Double base;
    private Double altura;

    public Triangulo(){ 
    }

    public Triangulo(Double ladoA,Double ladoB,Double ladoC,Double base, Double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double perimetro() {
        return ladoA + ladoB + ladoC;
    }

    @Override
    public Double area() {
        return (base * altura)/2;
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


    public Double getLadoC() {
        return ladoC;
    }

    public void setLadoC(Double ladoC) {
        this.ladoC = ladoC;
    }

   
    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

  
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

}
