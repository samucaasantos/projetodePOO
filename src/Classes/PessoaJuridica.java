package Classes;

import java.util.Date;

public class PessoaJuridica extends Pessoa {
    String nome_fantasia;
    int num_funcionario;

    public PessoaJuridica(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome_fantasia, int num_funcionario) {
        super(nome_oficial, cpf_cnpj, endereco, telefone);
        this.nome_fantasia = nome_fantasia;
        this.num_funcionario = num_funcionario;
    }

    protected String getCNPJ() {
        return cpf_cnpj;
    }

    protected String getNomeFantasia() {
        return nome_oficial;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public int getNum_funcionario() {
        return num_funcionario;
    }

    public void setNum_funcionario(int num_funcionario) {
        this.num_funcionario = num_funcionario;
    }
}
