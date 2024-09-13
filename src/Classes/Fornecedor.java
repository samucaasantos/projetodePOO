package Classes;

import java.util.ArrayList;

public class Fornecedor extends PessoaJuridica {
    ArrayList<Contrato> contratos;

    public Fornecedor(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome_fantasia, int num_funcionario, ArrayList<Contrato> contratos) {
        super(nome_oficial, cpf_cnpj, endereco,telefone, nome_fantasia, num_funcionario);
        this.contratos = contratos;
    }

    public Fornecedor(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome_fantasia, int num_funcionario) {
        super(nome_oficial, cpf_cnpj, endereco,telefone, nome_fantasia, num_funcionario);
        this.contratos = new ArrayList<>();
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Nome fantasia: " + this.getNome_fantasia());
        System.out.println("Quantidade de funcionários: " + this.getNum_funcionario());
        System.out.println("Contrato(s):");
        for (int i = 0; i < this.getContratos().size(); i++) {
            System.out.println(this.getContratos().get(i).getNum_contrato());
        }
    }
}
