package pessoa.empresas;

import pessoa.PessoaJuridica;

public class EmpresaSimples extends PessoaJuridica {

    public static final double IMPOSTO_FATURAMENTO = 0.06;

    public EmpresaSimples(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome, faturamentoAnual, despesaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getFaturamentoAnual() * 0.06;
    }
}
