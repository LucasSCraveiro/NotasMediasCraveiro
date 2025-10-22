import static java.lang.Math.sqrt;

public class Geometrica implements MediaStrategy {

    @Override
    public Double CalcularMedia(double p1, double p2) {
        return sqrt(p1 * p2);
    }

    @Override
    public String verificarSituacao(double media) {
        if (media >= 7.0)
        {
            return "Aprovado";
        }
        else
        {
            return "Reprovado";
        }
    }

}
