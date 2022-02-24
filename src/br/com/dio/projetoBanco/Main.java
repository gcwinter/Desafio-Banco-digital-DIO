package br.com.dio.projetoBanco;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        final Movimentacao movimentacao = new MovimentacaoImpl();
        final funcoesBanco funcoesBanco = new funcoesBancoImpl();

        Banco banco = new Banco();

        Cliente gabriel = new Cliente();
        gabriel.setNome("gabriel cabo winter");
        gabriel.setCpf("xxx.yyy.zzz.ww");

        Cliente gustavo = new Cliente("gustavo winter", "000.000.000.00");

        Conta c1 = new Conta(gabriel, 10, new BigDecimal(550));
        Conta c2 = new Conta(gustavo, 20, new BigDecimal(1000));

        funcoesBanco.cadastrarConta(banco, c1);
        funcoesBanco.cadastrarConta(banco, c2);

        System.out.println("========FUNÇÕES DO BANCO=============");
        funcoesBanco.listarContas(banco);
        System.out.println("=====================");
        funcoesBanco.listarCliente(banco);
        System.out.println("=====================");
        funcoesBanco.saldoTotalDoBanco(banco);

        System.out.println("==========SALDO EM CONTAS===========");
        System.out.println("saldo em conta: " + c1.getNumero() + " R$" + c1.getSaldo());
        System.out.println("saldo em conta " + c2.getNumero() + " R$" + c2.getSaldo());

        System.out.println("==========DEPOSITO===========");
        movimentacao.depositar(c1, new BigDecimal(2000));
        movimentacao.depositar(c2, new BigDecimal(200));

        System.out.println("===========SALDO APÓS DEPOSITO==========");
        System.out.println("saldo em conta: " + c1.getNumero() + " R$" + c1.getSaldo());
        System.out.println("saldo em conta " + c2.getNumero() + " R$" + c2.getSaldo());


        System.out.println("========VERIFICANDO SALDO TOTAL DO BANCO=============");
        funcoesBanco.saldoTotalDoBanco(banco);

        System.out.println("==========SAQUE===========");
        movimentacao.sacar(c1, new BigDecimal(20200));
        movimentacao.sacar(c2, new BigDecimal(350));

        System.out.println("==========SALDO APOS SAQUE===========");
        System.out.println("saldo em conta: " + c1.getNumero() + " R$" + c1.getSaldo());
        System.out.println("saldo em conta " + c2.getNumero() + " R$" + c2.getSaldo());

        System.out.println("========VERIFICANDO SALDO TOTAL DO BANCO=============");
        funcoesBanco.saldoTotalDoBanco(banco);

        System.out.println("===========TRANSFERENCIA==========");
        movimentacao.transferir(c1, c2, new BigDecimal(350));

        System.out.println("==========VERIFICANDO SALDO APÓS TRANSFERENCIA===========");
        System.out.println("saldo em conta: " + c1.getNumero() + " R$" + c1.getSaldo());
        System.out.println("saldo em conta " + c2.getNumero() + " R$" + c2.getSaldo());

        System.out.println("========VERIFICANDO SALDO TOTAL DO BANCO=============");
        funcoesBanco.saldoTotalDoBanco(banco);
    }
}
