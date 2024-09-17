package classes;

import java.util.ArrayList;

public class PontodeParada {
    String nome;
    double latitude, longitude;
    static int id = 0;
    ArrayList<Aluno> alunos;
    static int numParadas = 0;

    public PontodeParada() {
        this.alunos = new ArrayList<>();
    }

    public PontodeParada(String nome, double latitude, double longitude, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.alunos = alunos;
        PontodeParada.numParadas += 1;
        PontodeParada.id ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }


    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public static void exibirTotalPontosDeParada() {
        System.out.println("Número total de pontos de parada criados: " + PontodeParada.numParadas);
    }

}
