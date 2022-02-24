package br.com.dio.projetoBanco;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contasBanco = new ArrayList<>();
    private List<Cliente> clientesBanco = new ArrayList<>();
    private BigDecimal saldoTotal = new BigDecimal(0);

    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientesBanco.add(cliente);
    }

    public void adicionarConta(Conta conta) {
        this.contasBanco.add(conta);
    }

    public List<Conta> getContasBanco() {
        return this.contasBanco;
    }


    public List<Cliente> getClientesBanco() {
        return clientesBanco;
    }


    @Override
    public String toString() {
        return "Banco{" +
                "contasBanco=" + contasBanco +
                ", clientesBanco=" + clientesBanco +
                '}';
    }
}
