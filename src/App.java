
// import prueba.*;
public class App {

    public static void main(String[] args) throws Exception {
        System.out.print("Estamos Aprendiendo Programacion en Java");
        // System.out.println("Hello, World!");
        // PARADIGMA DE PROGRAMACAO: ORIENTADA A OBJETOS(OOP,FUNCTIONAL, REACTIVE, ETC)
        // INSTRUCCIONES

        Animal animal_ = new Animal();
        animal_.sonido();

        Figuras circulo = new Circulo(5);
        System.out.println("Area del circulo es: " + circulo.CalcularArea() + ", y su volumen es: " + circulo.CalcularVolumnen());

        Figuras cuadrado = new Cuadrado(5);
        System.out.println("Area del cuadrado es: " + cuadrado.CalcularArea() + ", y su volumen es: " + cuadrado.CalcularVolumnen());

        Figuras rectangulo = new Rectangulo(5, 10);
        System.out.println("Area del rectangulo es: " + rectangulo.CalcularArea() + ", y su volumen es: " + rectangulo.CalcularVolumnen());

        Figuras hexagono = new Hexagono(6);
        System.out.println("Area del hexagono es: " + hexagono.CalcularArea() + ", y su volumen es: " + hexagono.CalcularVolumnen());

        // Suma suma = new Suma();
        // System.out.println(suma.Calcular(5, 10));
    }

}
