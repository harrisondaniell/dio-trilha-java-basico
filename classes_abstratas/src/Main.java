import pessoa.PessoaFisica;
import pessoa.gestao.GestorDeImpostos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("João", 45_00);
        var maria = new PessoaFisica("Maria", 180_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);

        System.out.printf("Total de impostos: %.2f", gestorImpostos.getValorTotalImpostos());

    }
}