//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Bohemian Rhapsody";
        minhaMusica.artista = "Queen";
        minhaMusica.duracaoEmSegundos = 355;

        System.out.println("Tocando agora: " + minhaMusica.titulo);
        System.out.println("Artista: " + minhaMusica.artista);
        System.out.println("Duracao: " + minhaMusica.duracaoEmSegundos);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Carlos";
        aluno1.nota = 8.5;
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ana";
        aluno2.nota = 6.0;
        aluno2.verificarStatus();



    }
}