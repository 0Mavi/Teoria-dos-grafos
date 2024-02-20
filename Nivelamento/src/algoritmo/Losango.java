package algoritmo;

public class Losango implements Forma {
    
    private Double lado;
    private Double diagonalMa;
    private Double diagonalMe;

    public Losango(){ 
    }

    public Losango(Double lado,Double diagonalMa,Double diagonalMe) {
        this.lado = lado;
        this.diagonalMa = diagonalMa;
        this.diagonalMe = diagonalMe;
        
    }

    
    @Override
    public Double perimetro() {
        return 4 * lado;
    }

    @Override
    public Double area() {
        return (diagonalMa * diagonalMe) / 2;
    }


    /**
     * @return Double return the lado
     */
    public Double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(Double lado) {
        this.lado = lado;
    }

    /**
     * @return Double return the diagonalMa
     */
    public Double getDiagonalMa() {
        return diagonalMa;
    }

    /**
     * @param diagonalMa the diagonalMa to set
     */
    public void setDiagonalMa(Double diagonalMa) {
        this.diagonalMa = diagonalMa;
    }

    /**
     * @return Double return the diagonalMe
     */
    public Double getDiagonalMe() {
        return diagonalMe;
    }

    /**
     * @param diagonalMe the diagonalMe to set
     */
    public void setDiagonalMe(Double diagonalMe) {
        this.diagonalMe = diagonalMe;
    }

}
