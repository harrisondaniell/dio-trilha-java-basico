package com.github.pagamento;

public class Transferencia implements MetodoPagamento {


    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiário não possui chave Pix");
        }

        System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f com a chave %s %n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());
    }
}
