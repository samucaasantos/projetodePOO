package classes;

import java.util.ArrayList;
import java.util.Scanner;

import static classes.Aplicacao.rotas;

public class Rota {
    ArrayList<PontodeParada> pontosdeParada;
    static int id = 0;
    static int numRotas = 0;

    public Rota(){
        this.pontosdeParada = new ArrayList<>();
    }

    public Rota(ArrayList<PontodeParada> pontosdeParada) {
        this.pontosdeParada = pontosdeParada;
        Rota.numRotas+=1;
        Rota.id ++;
    }

    public ArrayList<PontodeParada> getPontosdeParada() {
        return pontosdeParada;
    }

    public void setPontosdeParada(ArrayList<PontodeParada> pontosdeParada) {
        this.pontosdeParada = pontosdeParada;
    }

    public int getId() {
        return id;
    }

    public int demandaRota() {
        int demanda = 0;
        for (int i = 0; i < getPontosdeParada().size(); i++) {
            demanda += getPontosdeParada().get(i).getAlunos().size();
        }
        return demanda;
    }

    public static void exibirTotalRotas() {
        System.out.println("Número total de rotas criadas: " + rotas.size());
    }

    public static void calcularDemandaRota(Scanner scanner) {
        System.out.print("Digite o número da rota (0 a " + (rotas.size() - 1) + "): ");
        int numRota = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        if (numRota >= 0 && numRota < rotas.size()) {
            int demanda = 0;
            for (PontodeParada ponto : rotas.get(numRota)) {
                demanda += ponto.getAlunos().size();
            }
            System.out.println("Demanda total da rota " + numRota + ": " + demanda + " alunos.");
        } else {
            System.out.println("Rota inválida.");
        }
    }

}
