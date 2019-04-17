package model.domain;

/**
 *
 * @author Admin
 */
public class PlasticoImportacao  implements Lote{
        	 
    private String numConta;
	
    private String nomePlastico;

    private String cpf;
	
    private String numPlastico;
    
    //atributos para pegar o numero do lote, primeira linha do arquivo
    private String tipoDoLote;

    private String numeroDoLote;
    
    
    @Override
	public String getTipoLote() {
		return "Plastico";
	}

    public PlasticoImportacao() {
        super();
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNomePlastico() {
        return nomePlastico;
    }

    public void setNomePlastico(String nomePlastico) {
        this.nomePlastico = nomePlastico;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumPlastico() {
        return numPlastico;
    }

    public void setNumPlastico(String numPlastico) {
        this.numPlastico = numPlastico;
    }

    public String getTipoDoLote() {
        return tipoDoLote;
    }

    public void setTipoDoLote(String tipoDoLote) {
        this.tipoDoLote = tipoDoLote;
    }

    public String getNumeroDoLote() {
        return numeroDoLote;
    }

    public void setNumeroDoLote(String numeroDoLote) {
        this.numeroDoLote = numeroDoLote;
    }

    @Override
    public String toString() {
        return "PlasticoImportacao{" + "numConta=" + numConta + ", nomePlastico=" + nomePlastico + ", cpf=" + cpf + ", numPlastico=" + numPlastico + ", tipoDoLote=" + tipoDoLote + ", numeroDoLote=" + numeroDoLote + '}' + '\n';
    }
}