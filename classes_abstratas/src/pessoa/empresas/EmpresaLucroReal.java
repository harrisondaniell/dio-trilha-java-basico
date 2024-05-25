package pessoa.empresas;

import pessoa.PessoaJuridica;

public class EmpresaLucroReal extends PessoaJuridica {

    public static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getLucroAnual() * 0.25;
    }
}
