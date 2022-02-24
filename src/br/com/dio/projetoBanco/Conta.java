package br.com.dio.projetoBanco;

import java.math.BigDecimal;


public class Conta {
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private BigDecimal saldo;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public Conta(Cliente cliente, int agencia, BigDecimal saldo) {
        this.agencia = agencia;
this.cliente=cliente;
        this.saldo = saldo;
        this.numero = SEQUENCIAL++;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ",Cliente= "+ cliente +
                '}';
    }
}
