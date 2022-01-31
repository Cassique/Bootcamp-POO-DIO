import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Desafio desafio = new Desafio();
        desafio.setTitulo("Jogo da Velha");
        desafio.setDescricao("Jogo da Velha com impressão no console");

        Projeto projeto = new Projeto();
        projeto.setTitulo("Abstraindo um Bootcamp com POO");
        projeto.setDescricao("Abstraindo um Bootcamp com POO totalmente completo com " +
                "a utilização do mais alto nível de coleções para a implementação " +
                "da regra de negócio com a super Cami");
        projeto.setNotaImplementacao(10);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafio);
        bootcamp.getConteudos().add(projeto);

        Dev dev = new Dev();
        dev.setNome("Camila");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+dev.getNome()+":" + dev.getConteudosInscritos());
        dev.progredir();

        dev.progredir();

        dev.progredir();
        dev.progredir();

        System.out.println("Conteúdos Inscritos "+dev.getNome()+":" + dev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+dev.getNome()+":" + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

        System.out.println("***************************************************************************************");

        Dev segundoDev = new Dev();
        segundoDev.setNome("Joao");
        segundoDev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+segundoDev.getNome()+":" + segundoDev.getConteudosInscritos());
        dev.progredir();
        segundoDev.progredir();
        segundoDev.progredir();
        segundoDev.progredir();
        segundoDev.progredir();
        segundoDev.progredir();
        System.out.println("Conteúdos Inscritos "+segundoDev.getNome()+":" + segundoDev.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos "+segundoDev.getNome()+":" + segundoDev.getConteudosConcluidos());
        System.out.println("XP:" + segundoDev.calcularTotalXp());

    }

}
