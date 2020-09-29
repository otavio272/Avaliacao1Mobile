public class Circulo {

    private double raio = 1.0;
    private String cor = "vermelho";

    public Circulo(double raio, String cor) {
        this.cor = cor;
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


}