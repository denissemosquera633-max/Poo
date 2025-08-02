package uni1a;

// Subclase Cortometraje que extiende de ContenidoAudiovisual
public class Cortometraje extends ContenidoAudiovisual {
    private String festival;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String festival) {
        super(titulo, duracionEnMinutos, genero);
        this.festival = festival;
    }

    // Getters y setters
    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Festival: " + this.festival);
    }
}