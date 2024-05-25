import fiscal.GestorFiscal;
import fiscal.NotaFiscal;
import fiscal.NotaFiscalProduto;
import fiscal.NotalFiscalServico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotalFiscalServico("Reparo da roda", 1100, false);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImpostos());
//        System.out.println(nfReparoMotor.calcularImpostos());
    }
}