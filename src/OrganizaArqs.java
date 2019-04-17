
import java.io.File;
import java.util.Arrays;

/**
 *
 * @author admin
 */
public class OrganizaArqs {
   
    private File docs;
    
    private File arqvos[];
    
    public File[] getArqvos(String dir){
         this.docs = new File(dir);
         this.arqvos= docs.listFiles();
         Arrays.sort(arqvos);
         return arqvos;
    }    
}
