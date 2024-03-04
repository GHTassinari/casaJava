package casa;

public class TestePorta {
    public static void main(String[] args) {
        Porta porta = new Porta();


        // Testes da porta
        porta.abre();
        System.out.println("Porta aberta: " + porta.estaAberta());

        porta.setCor("Azul");
        System.out.println("Cor da porta: " + porta.getCor());

        porta.fecha();
        System.out.println("Porta aberta: " + porta.estaAberta());

        porta.setDimensaoX(1.0);
        porta.setDimensaoY(2.0);
        porta.setDimensaoZ(0.5);

        System.out.println("Dimensões da porta: " + porta.getDimensaoX() + " x " + porta.getDimensaoY() + " y " + porta.getDimensaoZ() + " z ");
    }
}
