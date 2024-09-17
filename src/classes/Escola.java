package classes;

import java.util.ArrayList;

public class Escola extends PessoaJuridica{
    ArrayList<Aluno> alunos;

    public Escola(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome_fantasia, int num_funcionario){
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome_fantasia, num_funcionario);
        this.alunos = new ArrayList<>();
    }
    public Escola(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome_fantasia, int num_funcionario,ArrayList<Aluno> alunos) {
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome_fantasia, num_funcionario);
        this.alunos = alunos;
    }


    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void matricularAluno(Aluno aluno) {
        this.getAlunos().add(aluno);
        System.out.println("aluno matriculado");
    }

    public void AlunosMatriculados(){
        for (int i=0; i<this.getAlunos().size(); i++) {
            System.out.println( this.getAlunos().get(i).getMatricula() +  this.getAlunos().get(i).getCpf_cnpj() +  this.getAlunos().get(i).getNome() +  this.getAlunos().get(i).getSerie());
        }
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Nome fantasia: " + this.getNome_fantasia());
        System.out.println("Quantidade de funcionários: " + this.getNum_funcionario());
        System.out.println("Alunos:");
        for (int i = 0; i < this.getAlunos().size(); i++) {
            System.out.println(this.getAlunos().get(i).getNome_oficial());
        }
    }
}
