package classes;

public class Veiculo {
    String placa;
    Integer ano;
    String modelo;
    Integer capacidade;
    Integer tipo;
    Contrato contrato;

    public Veiculo(String placa, Integer ano, String modelo, Integer capacidade, Contrato contrato){
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.tipo = 1;
        this.contrato = contrato;
    }

    public Veiculo(String placa, Integer ano, String modelo, Integer capacidade){
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.tipo = 0;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }
    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        if(this.tipo == 0){
            System.out.println("Método Inválido");
        }else{
            this.contrato = contrato;
        }

    }
    public String verificaVeiculo(){
        if (this.tipo == 0){
            return "próprio";
        }else{
            return "alugado";
        }
    }
}
