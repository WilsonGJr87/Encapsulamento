package model;

public class ContaBancaria {
    private float saldo;
    private String titular;

    public ContaBancaria(float saldo, String titular) {
        if saldo < 0
            saldo = 0;

        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(float valor) {
        if valor <= 0 {
            System.out.println("Não é possível depositar valores menores ou iguais a zero!");
            return;
        }

        saldo += valor;
    }

    public void sacar(float valor) {
        if valor <= 0 {
            System.out.println("Não é possível sacar valores menores ou iguais a zero!");
            return;
        }
        if valor > saldo {
            System.out.println("Não é possível sacar um saldo maior que o disponível!");
            return;
        }
        saldo -= valor;
        if saldo < 0
            saldo = 0;

    }

    public float getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
 }