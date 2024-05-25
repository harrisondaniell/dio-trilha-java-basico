package fiscal;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal ... notasFiscais) {
        for (NotaFiscal notasFiscal : notasFiscais) {
            notasFiscal.emitir();
            System.out.println("----------------");
        }
    }
}
