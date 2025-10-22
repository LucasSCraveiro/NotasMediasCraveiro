public class Aritmetica implements MediaStrategy {

    @Override
    public Double CalcularMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String verificarSituacao(double media) {
        if (media >= 5.0)
        {
            return "Aprovado";
        }
        else
        {
            return "Reprovado";
        }
    }

}
