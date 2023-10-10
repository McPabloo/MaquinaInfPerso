public class Personaje {
    private String nombre;
    private String genero;
    private String tipo;
    private String descripcion;
    private String deporte;
    private String marca;
    private String tipoArtista;
    private String tipoEntretenimiento;

    public Personaje(String nombre, String genero, String tipo, String descripcion, String deporte, String marca, String tipoArtista, String tipoEntretenimiento) {
        this.nombre = nombre;
        this.genero = genero;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.deporte = deporte;
        this.marca = marca;
        this.tipoArtista = tipoArtista;
        this.tipoEntretenimiento = tipoEntretenimiento;
    }

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

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoArtista() {
        return tipoArtista;
    }

    public void setTipoArtista(String tipoArtista) {
        this.tipoArtista = tipoArtista;
    }

    public String getTipoEntretenimiento() {
        return tipoEntretenimiento;
    }

    public void setTipoEntretenimiento(String tipoEntretenimiento) {
        this.tipoEntretenimiento = tipoEntretenimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Género: " + genero + "\n" +
               "Tipo: " + tipo + "\n" +
               "Descripción: " + descripcion + "\n" +
               "Deporte: " + deporte + "\n" +
               "Marca: " + marca + "\n" +
               "Tipo de Artista: " + tipoArtista + "\n" +
               "Tipo de Entretenimiento: " + tipoEntretenimiento + "\n";
    }
}
