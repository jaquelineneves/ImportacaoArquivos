/**
 *
 * @author Admin
 */
public enum TipoDeProcessador {
    
    /*essas em maiusculas é como se fosse constantes*/
    CLIENTE(new ProcessadoraCliente()),
    CONTA(new ProcessadoraConta()),
    TRANSACAO(new ProcessadoraTransacao()),
    PLASTICO(new ProcessadoraPlastico());
    
    private String nomeDoArquivo;
    private ProcessadorLinha processadorLinha;

    private TipoDeProcessador(ProcessadorLinha processadorLinha) {
        this.processadorLinha = processadorLinha;
    }

    public ProcessadorLinha getProcessadorLinha() {
        return processadorLinha;
    }    
}
