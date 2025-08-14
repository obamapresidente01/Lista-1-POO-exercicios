public class Aluno {
    public String nome;
    public double nota;


    public void verificarStatus() {
        if (nota <= 6.0) {
            System.out.println("Ana foi reprovada!");
        } else {
            System.out.println("Carlos foi aprovado!");
        }
    }
}
