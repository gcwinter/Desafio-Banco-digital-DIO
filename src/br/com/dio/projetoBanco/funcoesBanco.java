package br.com.dio.projetoBanco;

import java.math.BigDecimal;

public interface funcoesBanco {

    void listarContas(Banco banco);

    void saldoTotalDoBanco(Banco banco);

    void listarCliente(Banco banco);

    void cadastrarConta(Banco banco,Conta conta);

}
