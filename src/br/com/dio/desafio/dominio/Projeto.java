package br.com.dio.desafio.dominio;

public class Projeto extends Conteudo {

    private int notaImplementacao;

    @Override
    public double calcularXp() {
        return XP_PADRAO * notaImplementacao;
    }

    public Projeto() {
    }

    public int getNotaImplementacao() {
        return notaImplementacao;
    }

    public void setNotaImplementacao(int notaImplementacao) {
        this.notaImplementacao = notaImplementacao;
    }

    @Override
    public String toString() {
        return "Projeto {" +
                "Titulo ='" + getTitulo() + '\'' +
                ", Descricao ='" + getDescricao() + '\'' +
                ", Nota Implementacão=" + notaImplementacao +
                '}';
    }
}