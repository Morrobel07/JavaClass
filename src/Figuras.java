
abstract class Figuras {

    public abstract double CalcularArea();

    public abstract double CalcularVolumnen();

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

    @Override
    public double CalcularVolumnen() {
        return 4 / 3 * Math.PI * Math.pow(area, 3);
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

    @Override
    public double CalcularVolumnen() {
        return lado * lado * lado;
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

    @Override
    public double CalcularVolumnen() {
        return base * altura * altura;
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

    @Override
    public double CalcularVolumnen() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 3)) / 2;
    }

}
