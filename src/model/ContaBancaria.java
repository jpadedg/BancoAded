package model;
public class ContaBancaria {
    private final String titular;
    private double saldo;
    private double chequeEspecial;

    public ContaBancaria(String titular, double chequeEspecial) {
        if (titular == null || titular.isEmpty())
            throw new IllegalArgumentException("Titular inválido");
        if (chequeEspecial < 0)
            throw new IllegalArgumentException("Cheque especial não pode ser negativo");

        this.titular = titular;
        this.saldo = 0;
        this.chequeEspecial = chequeEspecial;
    }

    public String getTitularNome() {
        return titular;
    }

    public double getSaldoAtual() {
        return saldo;
    }

    public double getChequeEspecialLiberado() {
        return chequeEspecial;
    }

    public void setChequeEspecialLiberado(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("Cheque especial não pode ser negativo");
        chequeEspecial = valor;
    }

    public void depositar(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("Valor de depósito deve ser maior que 0.");
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("Valor de saque deve ser maior que 0.");
        if (valor > saldo + chequeEspecial)
            throw new IllegalArgumentException("Saldo insuficiente para saque.");

        saldo -= valor;
    }

    
}