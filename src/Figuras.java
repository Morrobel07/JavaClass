
public abstract class Figuras {

    public abstract double CalcularArea();

}

class Circulo extends Figuras {

    private double area;

    public Circulo(double area) {
        this.area = area;
    }

    @Override
    public double CalcularArea() {
        return Math.PI * area * area;
    }
}

class Cuadrado extends Figuras {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return lado * lado;

    }

}

class Rectangulo extends Figuras {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }

}

class Hexagono extends Figuras {

    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;

    }

}
