import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());


       // System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoacks = new Dev();
        devJoacks.setNome("Joacks");
        devJoacks.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joacks" + devJoacks.getConteudoInscrito());

        devJoacks.progredir();
        devJoacks.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Joacks" + devJoacks.getConteudoInscrito());
        System.out.println("Conteúdos Concluidos Joacks" + devJoacks.getConteudosConcluidos());
        System.out.printf("XP:" + devJoacks.calcular_total_xp());

        System.out.println("----------");

        Dev devLara = new Dev();
        devLara.setNome("Lara");
        devLara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lara" + devLara.getConteudoInscrito());

        devLara.progredir();
        devLara.progredir();
        devLara.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos Lara" + devLara.getConteudoInscrito());

        System.out.println("Conteúdos Concluidos Lara" + devLara.getConteudosConcluidos());
        System.out.printf("XP:" + devLara.calcular_total_xp());
    }

}
