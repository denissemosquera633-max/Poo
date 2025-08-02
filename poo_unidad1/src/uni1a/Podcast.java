package uni1a;

// Subclase Podcast que extiende de ContenidoAudiovisual
public class Podcast extends ContenidoAudiovisual {
    private String host;
    private String plataforma;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String host, String plataforma) {
        super(titulo, duracionEnMinutos, genero);
        this.host = host;
        this.plataforma = plataforma;
    }

    // Getters y setters
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Host: " + this.host);
        System.out.println("Plataforma: " + this.plataforma);
    }
}