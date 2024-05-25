package fiscal;

public class NotalFiscalServico extends NotaFiscal {

    public static final double VALOR_MAXIMO_ISENCAO_FISCAL = 1_000;
    public static final double ALIQUOTA_IMPOSTOS = 0.18;
    private boolean intermunicipal;

    public NotalFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }

    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS;
        if (isIsentoImpostos()) {
            valorImpostos = 0;
        }

        return valorImpostos;
    }

    private boolean isIsentoImpostos() {
        return isIntermunicipal() && getValorTotal() <= VALOR_MAXIMO_ISENCAO_FISCAL;
    }
}
