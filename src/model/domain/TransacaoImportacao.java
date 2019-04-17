package model.domain;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class TransacaoImportacao implements Lote {

    private String numConta_Transacao;

    private String numPlastico_Transacao;

    private Double valorTransacao;

    private Date dataHoraTransacao;

    private Integer codigoEstabelecimento;
    
        //atributos para pegar o numero do lote, primeira linha do arquivo
    private String tipoDoLote;

    private String numeroDoLote;

    @Override
    public String getTipoLote() {
        return "Transacao";
    }

    public String getNumConta_Transacao() {
        return numConta_Transacao;
    }

    public void setNumConta_Transacao(String numConta_Transacao) {
        this.numConta_Transacao = numConta_Transacao;
    }

    public String getNumPlastico_Transacao() {
        return numPlastico_Transacao;
    }

    public void setNumPlastico_Transacao(String numPlastico_Transacao) {
        this.numPlastico_Transacao = numPlastico_Transacao;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public Date getDataHoraTransacao() {
        return dataHoraTransacao;
    }

    public void setDataHoraTransacao(Date dataHoraTransacao) {
        this.dataHoraTransacao = dataHoraTransacao;
    }

    public Integer getCodigoEstabelecimento() {
        return codigoEstabelecimento;
    }

    public void setCodigoEstabelecimento(Integer codigoEstabelecimento) {
        this.codigoEstabelecimento = codigoEstabelecimento;
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
        return  "TransacaoImportacao{" + "numConta_Transacao=" + numConta_Transacao + ", numPlastico_Transacao=" + numPlastico_Transacao + ", valorTransacao=" + valorTransacao + ", dataHoraTransacao=" + dataHoraTransacao + ", codigoEstabelecimento=" + codigoEstabelecimento + ", tipoDoLote=" + tipoDoLote + ", numeroDoLote=" + numeroDoLote + '}' + '\n';
    }
}
