
public class Libro {

    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void Show() {

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);

    }

}
