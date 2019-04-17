
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import model.domain.Lote;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        
        String dir = System.getProperty("user.dir") + "/arquivos/";
        File arqvos[];
             
        OrganizaArqs ls = new OrganizaArqs();
        arqvos = ls.getArqvos(dir);
        
        //lê o arquivo e retorna uma lista das linhas do arquivo
        LeituraArquivo la = new LeituraArquivo();

        ProcessadoraArquivo processadora;
        
        for(int i=0;i<arqvos.length;i++){
                
            List<String> lista = la.lerArquivo(dir+arqvos[i].getName());
            String nomeArquivo=  la.getNomeArquivo();
            System.out.println("O nome do arquivo eh: "+nomeArquivo);
               
            processadora = new ProcessadoraArquivo( TipoDeProcessador.valueOf(nomeArquivo).getProcessadorLinha());

            List<Lote> resultado = processadora.processaArquivo(lista);
            System.out.println(resultado);
            System.out.println("------------------------------------------------------------------------------------\n");
        }
    }
}
