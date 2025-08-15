public class Aluno {
    public String nome;
    public double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void verificarStatus() {
        if (nota <= 6.0) {
            System.out.println("Ana foi reprovada!");
        } else {
            System.out.println("Carlos foi aprovado!");
        }
    }
}
