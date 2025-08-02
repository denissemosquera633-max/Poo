package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas; // Relación de composición: una serie tiene temporadas

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    // Getters y setters
    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void agregarTemporada(Temporada temporada) {
        this.temporadas.add(temporada);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración de episodio: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + this.temporadas.size());
        System.out.println("Temporadas: ");
        for (Temporada temporada : temporadas) {
            System.out.println("  - " + temporada);
        }
    }
}