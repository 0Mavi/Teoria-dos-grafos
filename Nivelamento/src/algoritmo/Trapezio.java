package algoritmo;

public class Trapezio implements Forma {

    private Double ladoA;
    private Double ladoC;
    private Double baseMa;
    private Double baseMe;
    private double altura;


    public Trapezio(){ 
    }

    public Trapezio(double ladoA,double baseMe,double ladoC, double baseMa,double altura) {
       this.ladoA = ladoA;
       this.ladoC = ladoC;
       this.baseMa = baseMa;
       this.baseMe = baseMe;
       this.altura = altura; 
        
    }

    @Override
    public Double perimetro() {
        return ladoA + baseMe + ladoC + baseMa;
    }

    @Override
    public Double area() {
        return ((baseMa + baseMe)/2) * altura;
    }

    /**
     * @return Double return the ladoA
     */
    public Double getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return Double return the ladoC
     */
    public Double getLadoC() {
        return ladoC;
    }

    /**
     * @param ladoC the ladoC to set
     */
    public void setLadoC(Double ladoC) {
        this.ladoC = ladoC;
    }

    /**
     * @return Double return the baseMa
     */
    public Double getBaseMa() {
        return baseMa;
    }

    /**
     * @param baseMa the baseMa to set
     */
    public void setBaseMa(Double baseMa) {
        this.baseMa = baseMa;
    }

    /**
     * @return Double return the baseMe
     */
    public Double getBaseMe() {
        return baseMe;
    }

    /**
     * @param baseMe the baseMe to set
     */
    public void setBaseMe(Double baseMe) {
        this.baseMe = baseMe;
    }

    /**
     * @return double return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

}
