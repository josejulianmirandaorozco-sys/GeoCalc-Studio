package modelo;

public class Rectangulo extends Poligono {
    private double lado1;
    private double lado2;
    
    //metodo contructor 

    public Rectangulo(double lado1, double lado2, int numeroLados) {
        super(numeroLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //encapsulamiento 

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
   
    //implementar area y perimetro con Override en Mayuscula la O
   @Override
public double area() {
    return lado1 * lado2;
}

@Override
public double perimetro() {
    return 2 * (lado1 + lado2);
}

}
