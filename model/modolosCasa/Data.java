
package model.modolosCasa;
import java.time.LocalDate;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private Data data;
    
    public Data Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        return data = new Data(this.dia, this.mes, this.ano);
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public LocalData getData() {
        return data;
    }
    public void setData(LocalData data) {
        this.data = data;
    }
    
}
