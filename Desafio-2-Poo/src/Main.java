import java.time.LocalDate;

import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Java Developer", "Curso de desenvolvimento java - Apoio BancoPan & Dio", 200);
        Curso curso2 = new Curso("Javascript Developer", "Curso de desenvolvimento javascript - Apoio BancoPan", 100);
        Mentoria mentoria = new Mentoria("Mentoria de java", "Mentoria do curso de desenvolvimento java da DIO", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
