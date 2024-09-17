package classes;

import java.util.ArrayList;
import java.util.Date;

public class Contrato {
    Integer num_contrato;
    Date data_inicio, data_fim;
    Double valor;
    ArrayList<Veiculo> veiculos;
    ArrayList<Motorista> motoristas;
    Fornecedor fornecedor;

    public Contrato(){
        this.veiculos = new ArrayList<>();
        this.motoristas = new ArrayList<>();
    }
    public Contrato(Integer num_contrato, Date data_inicio, Date data_fim, Double valor) {
        this.num_contrato = num_contrato;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor = valor;
        this.fornecedor = null;
    }

    public Contrato(Integer num_contrato, Date data_inicio, Date data_fim, Double valor, ArrayList<Veiculo> veiculos, ArrayList<Motorista> motoristas){
        this.num_contrato = num_contrato;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.valor = valor;
        this.veiculos = veiculos;
        this.motoristas = motoristas;
        this.fornecedor = null;
    }

    public Integer getNum_contrato() {
        return num_contrato;
    }

    public void setNum_contrato(Integer num_contrato) {
        this.num_contrato = num_contrato;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public ArrayList<Motorista> getMotoristas() {
        return motoristas;
    }

    public void setMotoristas(ArrayList<Motorista> motoristas) {
        this.motoristas = motoristas;
    }

    public ArrayList<Veiculo> adicionaVeiculo(Veiculo veiculo) {
        if (veiculo.getTipo() == 0) {
            return this.getVeiculos();
        }else {
            this.getVeiculos().add(veiculo);
            return this.getVeiculos();
        }
    }

    public ArrayList<Veiculo> removeVeiculo(Veiculo veiculo) {
        for(int i = 0; i<this.getVeiculos().size(); i++){
            if (veiculo.equals(this.getVeiculos().get(i))){
                getVeiculos().remove(i);
                return getVeiculos();
            }
        }
        return getVeiculos();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ArrayList<Motorista> adicionaMotorista(Motorista motorista) {
        if (motorista.getTipo() == 0) {
            return this.getMotoristas();
        }else {
            this.getMotoristas().add(motorista);
            return this.getMotoristas();
        }
    }

    public ArrayList<Motorista> removeMotorista(Motorista motorista) {
        for(int i = 0; i<this.getMotoristas().size(); i++){
            if (motorista.equals(this.getMotoristas().get(i))){
                getMotoristas().remove(i);
                return getMotoristas();
            }
        }
        return getMotoristas();
    }

    public void adicionaFornecedor(PessoaJuridica pessoaJuridica) {
        if (pessoaJuridica instanceof Fornecedor) {
            this.fornecedor = (Fornecedor) pessoaJuridica;
            this.fornecedor.getContratos().add(this);
            System.out.println("Fornecedor adicionado ao contrato.");
        } else {
            System.out.println("Erro: Somente objetos do tipo Fornecedor podem ser adicionados ao contrato.");
        }
    }
}
