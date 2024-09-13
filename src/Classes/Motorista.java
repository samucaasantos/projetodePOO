package Classes;

import java.util.ArrayList;
import java.util.Date;
public class Motorista extends PessoaFisica {
    String num_habilitacao, cat_habilitacao;
    Integer tipo;
    ArrayList<Contrato> contratos;

    public Motorista(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome, String mae, String pai, String naturalidade, Date data_nascimento) {
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome, mae, pai, naturalidade, data_nascimento);
        this.contratos = new ArrayList<>();
    }

    public Motorista(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome, String mae, String pai, String naturalidade, Date data_nascimento, String num_habilitacao, String cat_habilitacao, ArrayList<Contrato> contratos) {
        super(nome_oficial, cpf_cnpj, endereco, telefone, nome, mae, pai, naturalidade, data_nascimento);
        this.num_habilitacao = num_habilitacao;
        this.cat_habilitacao = cat_habilitacao;
        this.tipo = 1;
        this.contratos = contratos;
    }

    public Motorista(String nome_oficial, String cpf_cnpj, Endereco endereco, String telefone, String nome, String mae, String pai, String naturalidade, Date data_nascimento, String num_habilitacao, String cat_habilitacao) {
        super(nome_oficial, cpf_cnpj,endereco, telefone, nome, mae, pai, naturalidade, data_nascimento);
        this.num_habilitacao = num_habilitacao;
        this.cat_habilitacao = cat_habilitacao;
        this.tipo = 0;
    }

    public String getNum_habilitacao() {
        return num_habilitacao;
    }

    public void setNum_habilitacao(String num_habilitacao) {
        this.num_habilitacao = num_habilitacao;
    }

    public String getCat_habilitacao() {
        return cat_habilitacao;
    }

    public void setCat_habilitacao(String cat_habilitacao) {
        this.cat_habilitacao = cat_habilitacao;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void setContrato(Contrato contrato) {
        if (this.tipo == 0) {
            System.out.println("Método inválido");
        } else {
            contratos.add(contrato);
        }
    }

    public String verificaMotorista() {
        if (this.tipo == 0) {
            return "servidor";
        }else{
            return "terceirizado";
        }
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        if (getContratos() == null) {
            System.out.println("Nome: " + this.getNome());
            System.out.println("Nome da mae: " + this.getMae());
            System.out.println("Nome do pai: " + this.getPai());
            System.out.println("Naturalidade: " + this.getNaturalidade());
            System.out.println("Data de nascimento: " + this.getData_nascimento());
            System.out.println("Número da habilitação: " + this.getNum_habilitacao());
            System.out.println("Categoria da hailitação: " + this.getCat_habilitacao());
            System.out.println("Tipo do contrato(0 para servidor e 1 para terceirizado: " + this.getTipo());
        }else {
            System.out.println("Nome: " + this.getNome());
            System.out.println("Nome da mae: " + this.getMae());
            System.out.println("Nome do pai: " + this.getPai());
            System.out.println("Naturalidade: " + this.getNaturalidade());
            System.out.println("Data de nascimento: " + this.getData_nascimento());
            System.out.println("Número da habilitação: " + this.getNum_habilitacao());
            System.out.println("Categoria da hailitação: " + this.getCat_habilitacao());
            System.out.println("Tipo do contrato(0 para servidor e 1 para terceirizado: " + this.getTipo());
            System.out.println("Contrato(s):");
            for (int i = 0; i < this.getContratos().size(); i++) {
                System.out.println(this.getContratos().get(i).getNum_contrato());
            }
        }
    }


}

