import java.time.LocalDate;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Aprenda a programar em java!");
        cursoJava.setCargaHoraria(30);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Mentoria do curso de desenvolvimento em java!");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Bootcamp de desenvolvimento java, apoio DIo & Banco Pan");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        Dev devHermeson = new Dev();
        devHermeson.setNome("Francisco Hermeson Oliveira dos Santos");
        devHermeson.inscreverBootCamp(bootcampJava);
        System.out.println("Conteúdos inscritos de Hermeson: " + devHermeson.getConteudosInscritos());
        devHermeson.progredir();
        devHermeson.progredir();

        Dev devMariana = new Dev();
        devMariana.setNome("Mariana Rodrigues de Lima");
        devMariana.inscreverBootCamp(bootcampJava);
        System.out.println("\nConteúdos inscritos de Mariana: " + devMariana.getConteudosInscritos());
        devMariana.progredir();
        devMariana.progredir();

        System.out.println("\nConteúdos inscritos de Hermeson: " + devHermeson.getConteudosInscritos());
        System.out.println("Conteúdos inscritos de Mariana: " + devMariana.getConteudosInscritos());
        System.out.println("\nConteúdos Concluidos de Hermeson: " + devHermeson.getConteudosConcluidos());
        System.out.println("\nConteúdos Concluidos de Mariana: " + devHermeson.getConteudosConcluidos());
        System.out.println("\nXP de Hermeson: " + devHermeson.calcularXP() + "\nXP de Mariana: " + devMariana.calcularXP());
    }
}
