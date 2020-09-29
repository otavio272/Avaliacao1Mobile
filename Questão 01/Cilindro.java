public class Cilindro {
    private Circulo base;
    private double altura;

    public Cilindro() {
        this.altura = 1.0;
        this.base = new Circulo(1.0, "azul");
    }
}