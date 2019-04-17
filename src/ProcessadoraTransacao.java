
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import model.domain.ClienteImportacao;
import model.domain.TransacaoImportacao;

/**
 *
 * @author Admin
 */
public class ProcessadoraTransacao implements ProcessadorLinha<TransacaoImportacao> {

    @Override
    public TransacaoImportacao getLinha(String linha, String cabecalho) throws ParseException {
        TransacaoImportacao transacao = new TransacaoImportacao();
        transacao.setNumConta_Transacao(linha.substring(1, 8));
        transacao.setNumPlastico_Transacao(linha.substring(8, 15));
        transacao.setValorTransacao(new Double(linha.substring(15,27)) / 100d);
        transacao.setCodigoEstabelecimento(new Integer(linha.substring(41, 47)));	
        
        String dataTransacao = linha.substring(27, 35);
        String horaTransacao = linha.substring(35, 41);
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy hhmmss");
        transacao.setDataHoraTransacao(sdf.parse(dataTransacao + " " + horaTransacao));
        
        transacao.setNumeroDoLote(cabecalho.substring(1,4));
        transacao.setTipoDoLote(transacao.getTipoLote());     
        
        return transacao;
    }
    
    /*
    public static void main(String args[]) throws Exception {
		String dir = System.getProperty("user.dir") + "/arquivos/";
		ProcessadoraArquivo<TransacaoImportacao> processadora = 
				new ProcessadoraArquivo<TransacaoImportacao>(new ProcessadoraTransacao());
		List<TransacaoImportacao> transacao = 
				processadora.processaArquivo(dir+"Transacao_20140220.txt");
		System.out.println(transacao);		
	}
    */
}