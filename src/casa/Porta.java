package casa;

public class Porta {

    private boolean aberta;
    private String cor;
    private double dimensaoX, dimensaoY, dimensaoZ;

    private static int totalPortasCriadas = 0;

    public Porta() {
        totalPortasCriadas++;
    }

    public static int getTotalPortasCriadas() {
        return totalPortasCriadas - 1;
    }

    public void abre() {
        aberta = true;
    }

    public void fecha() {
        aberta = false;
    }

    public void pinta(String novaCor) {
        cor = novaCor;
    }

    public boolean estaAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }


}
