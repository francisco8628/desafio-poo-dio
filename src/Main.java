import br.com.dio.desafio.dominio.BootCampo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("descrição do curso javaScript");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição da mentoria Java");
        mentoria1.setDate(LocalDate.now());

        mentoria2.setTitulo("mentoria de javaScript");
        mentoria2.setDescricao("descrição da mentoria JavaScript");
        mentoria1.setDate(LocalDate.now());

/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
*/
        BootCampo bootCamp = new BootCampo();
        bootCamp.setNome("BootCamp de Java");
        bootCamp.setDescricao("bootcamp para quem quer aprender java");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);
       // bootCamp.getConteudos().add(mentoria2);

        Dev devFrancisco = new Dev();
        Dev devBenjamin = new Dev();

        devFrancisco.setNome("Francisco");
        devFrancisco.insvreverBootCampo(bootCamp);
        devBenjamin.setNome("Benjamim");
        devBenjamin.insvreverBootCampo(bootCamp);

        System.out.println("Nome dev: "+ devFrancisco.getNome());
        System.out.println("Conteudos inscritos: "+devFrancisco.getConteudoEscritos());
        System.out.println("Conteudos concluidos:  "+devFrancisco.getConteudosConcluidos());
        System.out.println("XP: "+devFrancisco.calcularTotalXp());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nome dev: "+ devBenjamin.getNome());
        System.out.println("Conteudos inscritos: "+devBenjamin.getConteudoEscritos());
        System.out.println("Conteudos concluidos: "+devBenjamin.getConteudosConcluidos());
        System.out.println("XP: "+devBenjamin.calcularTotalXp());
        devBenjamin.progredir();
        devFrancisco.progredir();


        System.out.println("-------------------------------------------------------------");
        System.out.println("progediu");
        System.out.println("Nome dev: "+ devFrancisco.getNome());
        System.out.println("Conteudos inscritos: "+devFrancisco.getConteudoEscritos());
        System.out.println("Conteudos concluidos:  "+devFrancisco.getConteudosConcluidos());
        System.out.println("XP: "+devFrancisco.calcularTotalXp());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nome dev: "+ devBenjamin.getNome());
        System.out.println("Conteudos inscritos: "+devBenjamin.getConteudoEscritos());
        System.out.println("Conteudos concluidos: "+devBenjamin.getConteudosConcluidos());
        System.out.println("XP: "+devBenjamin.calcularTotalXp());
       // devBenjamin.progredir();
        devFrancisco.progredir();

        System.out.println("-------------------------------------------------------------");
        System.out.println("progediu");
        System.out.println("Nome dev: "+ devFrancisco.getNome());
        System.out.println("Conteudos inscritos: "+devFrancisco.getConteudoEscritos());
        System.out.println("Conteudos concluidos:  "+devFrancisco.getConteudosConcluidos());
        System.out.println("XP: "+devFrancisco.calcularTotalXp());
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nome dev: "+ devBenjamin.getNome());
        System.out.println("Conteudos inscritos: "+devBenjamin.getConteudoEscritos());
        System.out.println("Conteudos concluidos: "+devBenjamin.getConteudosConcluidos());
        System.out.println("XP: "+devBenjamin.calcularTotalXp());
        devBenjamin.progredir();
        devFrancisco.progredir();






    }
}
