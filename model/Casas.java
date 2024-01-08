package model;
import model.modolosCasa.*;

public class Casas {
    private Endereco endereco;
    private int quantidadeDeQuartos;
    private double locacao;
    private String proprietario;
    private int ifc;
    private int sae;
    private Data dataEntradaSistema;
    public Casas(Endereco endereco, int quantidadeDeQuartos, double locacao, String proprietario, int ifc, int sae,
            Data dataEntradaSistema) {
        this.endereco = endereco;
        this.quantidadeDeQuartos = quantidadeDeQuartos;
        this.locacao = locacao;
        this.proprietario = proprietario;
        this.ifc = ifc;
        this.sae = sae;
        this.dataEntradaSistema = dataEntradaSistema;
    }
    public Casas() {
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public int getQuantidadeDeQuartos() {
        return quantidadeDeQuartos;
    }
    public void setQuantidadeDeQuartos(int quantidadeDeQuartos) {
        this.quantidadeDeQuartos = quantidadeDeQuartos;
    }
    public double getLocacao() {
        return locacao;
    }
    public void setLocacao(double locacao) {
        this.locacao = locacao;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public int getIfc() {
        return ifc;
    }
    public void setIfc(int ifc) {
        this.ifc = ifc;
    }
    public int getSae() {
        return sae;
    }
    public void setSae(int sae) {
        this.sae = sae;
    }
    public Data getDataEntradaSistema() {
        return dataEntradaSistema;
    }
    public void setDataEntradaSistema(Data dataEntradaSistema) {
        this.dataEntradaSistema = dataEntradaSistema;
    }
    

}
