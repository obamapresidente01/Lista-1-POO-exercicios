public class PersonagemJogo {
    public String nome;
    public int nivel;
    public int pontosDeVida;

    public void receberDano(int dano) {
        pontosDeVida -= dano;
    }
    public void subirDeNivel() {
        nivel +=  1;
    }

    public void exibirStatus() {
        System.out.println(pontosDeVida);
        System.out.println(nivel);
        System.out.println(nome);
    }
}
