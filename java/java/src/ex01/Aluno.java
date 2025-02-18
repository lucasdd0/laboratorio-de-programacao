package ex01;

public class Aluno {
    int rm;
    String Nome;
    double[] nota = new double[2];

    public double CalcularMedia() {
        return (nota[0] + nota[1]) / 2;
    }
}
