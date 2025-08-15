//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Musica minhaMusica = new Musica();
//        minhaMusica.titulo = "Bohemian Rhapsody";
//        minhaMusica.artista = "Queen";
//        minhaMusica.duracaoEmSegundos = 355;
//
//        System.out.println("Tocando agora: " + minhaMusica.titulo);
//        System.out.println("Artista: " + minhaMusica.artista);
//        System.out.println("Duracao: " + minhaMusica.duracaoEmSegundos);
//
//        Aluno aluno1 = new Aluno();
//        aluno1.nome = "Carlos";
//        aluno1.nota = 8.5;
//        aluno1.verificarStatus();
//
//        Aluno aluno2 = new Aluno();
//        aluno2.nome = "Ana";
//        aluno2.nota = 6.0;
//        aluno2.verificarStatus();
//
//        contaBancaria minhaConta = new contaBancaria();
//        minhaConta.titular = "Juliana";
//        minhaConta.saldo = 1000.0;
//
//        minhaConta.depositar(500.0);
//        System.out.println("Novo saldo: " + minhaConta.saldo);
//
//        minhaConta.sacar(200.0);
//        System.out.println("Saldo após saque: " + minhaConta.saldo);
//
//        minhaConta.sacar(1500.0);
//        System.out.println("Saldo final: " + minhaConta.saldo);
//
//        PersonagemJogo heroi = new PersonagemJogo();
//        heroi.nome = "Aragorn";
//        heroi.nivel = 5;
//        heroi.pontosDeVida = 100;
//
//        heroi.exibirStatus();
//
//        heroi.receberDano(25);
//        heroi.subirDeNivel();
//
//        System.out.println("Após a batalha");
//        heroi.exibirStatus();

        //Metodo Construtor
        Musica minhaMusica = new Musica("Bohemian Rhapsody", "Queen", 355);
        minhaMusica.exibirFichaTecnica();

        Carro meuCarro = new Carro("Ford", "Mustang", 1969);
        meuCarro.exibirInformacoes();

        Aluno aluno1 = new Aluno("Carlos", 8.5);
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno("Ana", 6.0);
        aluno2.verificarStatus();


        //Emcapsulamento
        contaBancaria minhaConta = new contaBancaria("Juliana", 1000.0);
        minhaConta.depositar(500.0);

        System.out.println("Saldo atual: " + minhaConta.getSaldo());

    }
}