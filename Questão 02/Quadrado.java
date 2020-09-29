public class Quadrado implements Geometria{
    protected double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4;
    }


    @Override
    public double getArea() {
        return this.lado * this.lado;
    }
}
