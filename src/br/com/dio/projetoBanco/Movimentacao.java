package br.com.dio.projetoBanco;

import java.math.BigDecimal;

public interface Movimentacao {

    void sacar(Conta conta, BigDecimal valorSaque);

    void depositar(Conta conta,BigDecimal valorDeposito);

    void transferir(Conta contaSacada,Conta contaDepositada, BigDecimal valorTransferido);
}
