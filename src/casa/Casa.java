package casa;

public class Casa {

    private String cor;
    Porta objPorta = new Porta();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void pinta(String novaCor) {
        cor = novaCor;
    }

    public int quantasPortasEstaoAbertas() {
        return objPorta.getTotalPortasCriadas();
    }

}
