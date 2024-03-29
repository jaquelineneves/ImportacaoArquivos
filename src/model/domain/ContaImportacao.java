package model.domain;

public class ContaImportacao implements Lote {

    private char tipo;

    private String cpf;

    private Double valorLimite;

    private Integer diaVencimentoFatura;

    private String numeroConta;

    //atributos para pegar o numero do lote, primeira linha do arquivo
    private String tipoDoLote;

    private String numeroDoLote;

    @Override
    public String getTipoLote() {
        return "Conta";
    }

    public ContaImportacao() {
        super();
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(Double valorLimite) {
        this.valorLimite = valorLimite;
    }

    public Integer getDiaVencimentoFatura() {
        return diaVencimentoFatura;
    }

    public void setDiaVencimentoFatura(Integer diaVencimentoFatura) {
        this.diaVencimentoFatura = diaVencimentoFatura;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
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
        return  "ContaImportacao{" + "tipo=" + tipo + ", cpf=" + cpf + ", valorLimite=" + valorLimite + ", diaVencimentoFatura=" + diaVencimentoFatura + ", numeroConta=" + numeroConta + ", tipoDoLote=" + tipoDoLote + ", numeroDoLote=" + numeroDoLote + '}' + '\n';
    }
}
