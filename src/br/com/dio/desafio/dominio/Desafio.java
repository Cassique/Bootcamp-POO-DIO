package br.com.dio.desafio.dominio;

public class Desafio extends Conteudo{

    @Override
    public double calcularXp() {
        return XP_PADRAO * 10d;
    }

    public Desafio() {
    }

    @Override
    public String toString() {
        return "Desafio {" +
                "Titulo ='" + getTitulo() + '\'' +
                ", Descricao ='" + getDescricao() + '\'' + '}';
    }
}
