package br.com.dio.projetoBanco;

import java.math.BigDecimal;

public class MovimentacaoImpl implements Movimentacao {

    @Override
    public void sacar(Conta conta, BigDecimal valorSaque) {
        if(conta.getSaldo().subtract(valorSaque).longValue() <0 ) {
            System.out.println("valor indisponivel para saque");
        }
       else {
            conta.setSaldo(conta.getSaldo().subtract(valorSaque));
            System.out.println("foi sacado o valor de R$" + valorSaque);
        }
    }

    @Override
    public void depositar(Conta conta, BigDecimal valorDeposito) {
        conta.setSaldo(conta.getSaldo().add(valorDeposito));
        System.out.println("foi depositado o valor de R$"+ valorDeposito);

    }

    @Override
    public void transferir(Conta contaSacada, Conta contaDepositada, BigDecimal valorTransferido) {
        depositar(contaDepositada, valorTransferido);
        sacar(contaSacada, valorTransferido);
        System.out.println("foi transferido da Conta: "+ contaSacada.getNumero()  + " para a Conta: "+ contaDepositada.getNumero() + " o valor de R$ " + valorTransferido);
    }
}
