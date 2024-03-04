package casa;

public class TesteCasa {
    public static void main(String[] args) {

        // Testes da casa
        Casa casa = new Casa();

        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        casa.pinta("Branca");

        casa.objPorta.abre();
        casa.objPorta.fecha();

        System.out.println("Cor da casa: " + casa.getCor());
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
    }
}
