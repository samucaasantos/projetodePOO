package classes;


import java.util.Date;

public class Aluno extends PessoaFisica {
    String serie;
    Integer matricula;
    Escola escola;
    PontodeParada pontodeParada;

    public Aluno(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome, String mae, String pai, String naturalidade, Date data_nascimento, Integer matricula, String serie ) {
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome, mae, pai, naturalidade, data_nascimento);
        this.matricula = matricula;
        this.serie = serie;
    }

    public Aluno(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome, String mae, String pai, String naturalidade, Date data_nascimento, Integer matricula, String serie, Escola escola, PontodeParada pontodeParada) {
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome, mae, pai, naturalidade, data_nascimento);
        this.matricula = matricula;
        this.serie = serie;
        this.escola = escola;
        this.pontodeParada = pontodeParada;
    }


    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public PontodeParada getPontodeParada() {
        return pontodeParada;
    }

    public void setPontodeParada(PontodeParada pontodeParada) {
        this.pontodeParada = pontodeParada;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        if (this.getEscola() == null && this.getPontodeParada() == null) {
            System.out.println("Nome: " + this.getNome());
            System.out.println("Nome da mae: " + this.getMae());
            System.out.println("Nome do pai: " + this.getPai());
            System.out.println("Naturalidade: " + this.getNaturalidade());
            System.out.println("Data de nascimento: " + this.getData_nascimento());
            System.out.println("Matricula: " + this.getMatricula());
            System.out.println("Serie:" + this.getSerie());
        }else{
            System.out.println("Nome: " + this.getNome());
            System.out.println("Nome da mae: " + this.getMae());
            System.out.println("Nome do pai: " + this.getPai());
            System.out.println("Naturalidade: " + this.getNaturalidade());
            System.out.println("Data de nascimento: " + this.getData_nascimento());
            System.out.println("Matricula: " + this.getMatricula());
            System.out.println("Serie: " + this.getSerie());
            System.out.println("Escola: " + this.getEscola().getNome_oficial());
            System.out.println("Ponto de parada: " + this.getPontodeParada().getNome());

        }

    }

}
