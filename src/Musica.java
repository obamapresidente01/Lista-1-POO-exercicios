public class Musica {
    public String titulo;
    public String artista;
    public int duracaoEmSegundos;

    public Musica (String titulo, String artista, int duracaoEmSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public void exibirFichaTecnica() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duracao em segundos: " + this.duracaoEmSegundos);

    }
}
