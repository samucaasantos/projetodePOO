package classes;

import java.util.Date;

public class PessoaFisica extends Pessoa {
    String nome, mae, pai, naturalidade;
    Date data_nascimento;

    public PessoaFisica(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome, String mae, String pai, String naturalidade, Date data_nascimento) {
        super(nome_oficial, cpf_cnpj, endereco, telefone);
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
        this.naturalidade = naturalidade;
        this.data_nascimento = data_nascimento;
    }

    protected String getCPF() {
        return cpf_cnpj;
    }

    protected String getNomeCivil() {
        return nome_oficial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}

