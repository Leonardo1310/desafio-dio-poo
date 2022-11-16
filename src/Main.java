import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Leonardo" + devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        System.out.println("Conteúdos concluidos Leonardo" + devLeonardo.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Maria" + devLeonardo.getConteudosInscritos());
        System.out.println("XP: " + devLeonardo.calcularTotalXp());

        System.out.println("\n************************\n");

        Dev devMaria = new Dev();
        devLeonardo.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("Conteúdos concluidos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos Maria" + devMaria.getConteudosInscritos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}
