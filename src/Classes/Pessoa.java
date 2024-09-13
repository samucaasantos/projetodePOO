package Classes;


public class Pessoa {
    String nome_oficial, cpf_cnpj, telefone;
    Endereco endereco;

    public Pessoa(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone) {
        this.nome_oficial = nome_oficial;
        this.cpf_cnpj = cpf_cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    protected String getNome_oficial() {
        return nome_oficial;
    }

    protected void setNome_oficial(String nome_oficial) {
        this.nome_oficial = nome_oficial;
    }

    protected String getCpf_cnpj() {
        return cpf_cnpj;
    }

    protected void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void apresentarDados() {
        System.out.println("Nome oficial: " + this.getNome_oficial());
        System.out.println("CPF ou CNPJ: " + this.getCpf_cnpj());
        System.out.println("Rua: " + this.getEndereco().getRua());
        System.out.println("Número: " + this.getEndereco().getNumero());
        System.out.println("Complemento: " + this.getEndereco().getComplemento());
        System.out.println("Bairro: " + this.getEndereco().getBairro());
        System.out.println("Telefone: " + this.getTelefone());
    }

    public void verificarTipo() {
        System.out.println(this.getClass().getSimpleName());
    }



}
