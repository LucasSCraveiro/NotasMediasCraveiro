public class Disciplina {

    String nome;
    String situacao;
    Double p1, p2, media;
    MediaStrategy estrategia;

    public Disciplina(MediaStrategy estrategia)
    {
        this.estrategia = estrategia;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setP1(Double p1)
    {
        this.p1 = p1;
    }

    public void setP2(Double p2)
    {
        this.p2 = p2;
    }

    public void calcularMedia()
    {
        media = estrategia.CalcularMedia(p1, p2);
    }

    public String getNome()
    {
        return nome;
    }

    public Double getP1()
    {
        return p1;
    }

    public Double getP2()
    {
        return p2;
    }

    public Double getMedia()
    {
        return media;
    }

    public String getSituacao()
    {
        situacao = estrategia.verificarSituacao(media);
        return situacao;
    }

}
