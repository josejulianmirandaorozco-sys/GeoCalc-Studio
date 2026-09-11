package modelo;

public class Cuadrado extends Poligono {
    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }
}