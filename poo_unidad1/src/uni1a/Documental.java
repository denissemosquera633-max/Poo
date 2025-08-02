package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores; // Relación de agregación: un documental tiene investigadores

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    // Getters y setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public List<Investigador> getInvestigadores() {
        return investigadores;
    }

    public void agregarInvestigador(Investigador investigador) {
        this.investigadores.add(investigador);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.print("Investigadores: ");
        if (investigadores.isEmpty()) {
            System.out.println("N/A");
        } else {
            for (Investigador investigador : investigadores) {
                System.out.print(investigador.getNombre() + ", ");
            }
            System.out.println();
        }
    }
}