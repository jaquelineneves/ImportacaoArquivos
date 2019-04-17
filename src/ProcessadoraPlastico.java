
import java.text.ParseException;
import java.util.List;
import model.domain.PlasticoImportacao;

/**
 *
 * @author Admin
 */
public class ProcessadoraPlastico implements ProcessadorLinha<PlasticoImportacao> {

    @Override
    public PlasticoImportacao getLinha(String linha, String cabecalho) throws ParseException {
        PlasticoImportacao plastico = new PlasticoImportacao();
        plastico.setNumConta(linha.substring(1, 8).trim());
        plastico.setNomePlastico(linha.substring(8,38).trim());
        plastico.setCpf(linha.substring(38, 49));
        plastico.setNumPlastico(linha.substring(49, 56));
        
        //adicionar pra pegar as informações referente ao lote
        plastico.setNumeroDoLote(cabecalho.substring(1,4));
        plastico.setTipoDoLote(plastico.getTipoLote());
        return plastico;
    }

    /*
    public static void main(String args[]) throws Exception {
        String dir = System.getProperty("user.dir") + "/arquivos/";
        ProcessadoraArquivo<PlasticoImportacao> processadora
                = new ProcessadoraArquivo<PlasticoImportacao>(new ProcessadoraPlastico());
        List<PlasticoImportacao> plasticos
                = processadora.processaArquivo(dir + "Plastico_20140220.txt");
        System.out.println(plasticos);
    }
    */
}
