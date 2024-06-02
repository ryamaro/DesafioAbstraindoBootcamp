import java.time.LocalDate;

import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso java", "Descrição Curso Java", 8);
        Curso curso2 = new Curso("Curso js", "Descricao Curso js", 4);
        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição Mentoria de Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRyan = new Dev();
        devRyan.setNome("Ryan");
        devRyan.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Incritos Ryan: " + devRyan.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Ryan: " + devRyan.getConteudosConcluidos());
        devRyan.progredir();
        devRyan.progredir();
        System.out.println("Conteúdo Incritos Ryan: " + devRyan.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos Ryan: " + devRyan.getConteudosConcluidos());
        System.out.println("XP: " + devRyan.calcularTotalXP());


        System.out.println("--------------------------");

        Dev devJoao = new Dev();
        devJoao.InscreverBootcamp(bootcamp);
        devJoao.setNome("João");
        System.out.println("Conteúdo Incritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos João: " + devJoao.getConteudosConcluidos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdo Incritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdo Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());
    }

}
