package br.com.dio.projetoBanco;

import com.sun.source.tree.CaseTree;

import java.math.BigDecimal;

public class funcoesBancoImpl implements funcoesBanco {
    @Override
    public void listarContas(Banco banco) {
        banco.getContasBanco().forEach(System.out::println);
    }

    @Override
    public void saldoTotalDoBanco(Banco banco) {

        BigDecimal sum = banco.getContasBanco().stream().map(conta -> conta.getSaldo()).reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("saldo total do banco = " + sum);
    }

    @Override
    public void listarCliente(Banco banco) {
        banco.getClientesBanco().forEach(System.out::println);

    }

    @Override
    public void cadastrarConta(Banco banco, Conta conta) {

        banco.adicionarConta(conta);
        banco.adicionarCliente(conta.getCliente());
    }
}
