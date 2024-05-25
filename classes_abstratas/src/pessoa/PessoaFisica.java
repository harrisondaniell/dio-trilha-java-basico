package pessoa;

public class PessoaFisica extends Pessoa {

    static final private double RECEITA_ANUAL_ISENCAO = 50000;
    static final private double ALIQUOTA_IMPOSTO_RENDA = 0.2;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        if (isIsento()) {
            return 0;
        }
        return receitaAnual * ALIQUOTA_IMPOSTO_RENDA;
    }

    public boolean isIsento() {
        if (getReceitaAnual() < RECEITA_ANUAL_ISENCAO){
            return true;
        }
        return false;
    }
}
