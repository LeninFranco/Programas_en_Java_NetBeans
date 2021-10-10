package Pack1;

public class Cancion {
    private Integer id;
    private String nombre;
    private String album;
    private String artista;
    private Integer anio;
    private String duracion;

    public Cancion() {
    }

    public Cancion(Integer id, String nombre, String album, String artista, Integer anio, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.anio = anio;
        this.duracion = duracion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "[ "+this.id+" | "+this.nombre+" | "+this.album+" | "+this.artista+" | "+this.anio+" | "+this.duracion+" ]";
    }
}
