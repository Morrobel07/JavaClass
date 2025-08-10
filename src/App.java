
import prueba.*;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.print("Estamos Aprendiendo Programacion en Java");
        // System.out.println("Hello, World!");
        // PARADIGMA DE PROGRAMACAO: ORIENTADA A OBJETOS(OOP,FUNCTIONAL, REACTIVE, ETC)
        // INSTRUCCIONES

        Animal animal_ = new Animal();
        animal_.sonido();

        Figuras circulo = new Circulo(5);
        System.out.println(circulo.CalcularArea());

        Figuras cuadrado = new Cuadrado(5);
        System.out.println(cuadrado.CalcularArea());

        Figuras rectangulo = new Rectangulo(5, 10);
        System.out.println(rectangulo.CalcularArea());

        Figuras hexagono = new Hexagono(6);
        System.out.println(hexagono.CalcularArea());

        Suma suma = new Suma();
        System.out.println(suma.Calcular(5, 10));

    }

}
