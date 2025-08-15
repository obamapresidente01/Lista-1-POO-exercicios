public class contaBancaria {

//    public String titular;
//    public double saldo;

//
//    Metodos
    public void depositar(double valor){
        //recebe mais no saldo
        saldo = saldo + valor;
        //segundo jeito
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public contaBancaria(String juliana, double saldo) {
        System.out.println("Nome: " + juliana);
    }

    private double saldo;
    private String titular;

    public double getSaldo() {
        return saldo;
    }


}
