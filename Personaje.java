public class Personaje {
    private String nombre;
    private String genero;
    private String tipo;
    private String descripcion;

    public Personaje(String nombre, String genero, String tipo, String descripcion) {
        this.nombre = nombre;
        this.genero = genero;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Getters y setters (métodos para acceder y modificar los atributos)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Género: " + genero + "\n" +
               "Tipo: " + tipo + "\n" +
               "Descripción: " + descripcion + "\n";
    }
}
