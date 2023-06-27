
package entidades;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/


public class Libro {
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public String NumeroPaginas;

    public Libro() {
    }
    
    public Libro(String ISBN, String Titulo, String Autor, String NumeroPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }

    
}
