package pessoa.gestao;

import pessoa.Pessoa;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa) {
        valorTotalImpostos += pessoa.calcularImpostos();
        System.out.println("Impostos devidos de " + pessoa.getNome() + ": " + pessoa.calcularImpostos());
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
