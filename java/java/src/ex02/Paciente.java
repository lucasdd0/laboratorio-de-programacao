package ex02;

public class Paciente {
    String nome;
    int idade, frequencia;

    public int frequanciaMaxima() {
        return 220 - idade;
    }

    // metodo para calcular e retornar a freq alvo
    public double[] frequenciaAlvo() {
        double[] alvo = new double[2];
        double maxima = frequanciaMaxima();
        alvo[0] = maxima * 0.5;
        alvo[1] = maxima * 0.85;
        return alvo;
    }

}
