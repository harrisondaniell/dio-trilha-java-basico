import com.github.contaspagar.modelo.Holerite;
import com.github.contaspagar.modelo.OrdemServico;
import com.github.contaspagar.servico.ServicoContaPagar;
import com.github.pagamento.Beneficiario;
import com.github.pagamento.DocumentoPagavel;
import com.github.pagamento.MetodoPagamento;
import com.github.pagamento.Pix;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MetodoPagamento metodoPagamento = new Pix();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario holerite = new Beneficiario("Daniel", "minha chave", "conta");
        Holerite documento = new Holerite(holerite, 100, 168);

        var fornecedor = new Beneficiario("Consultoria X", "88474",  "jfasjf");
        var os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(documento);
        servicoContaPagar.pagar(os);
    }
}