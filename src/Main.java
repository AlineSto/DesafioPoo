import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String []args){
     Curso curso1 = new Curso();
       curso1.setTitulo("Java");
       curso1.setDescricao("descricao do curso");
       curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("descricao do curso JS");
        curso2.setCargaHoraria(4);


      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("Mentoria Java");
      mentoria.setDescricao("mentoria em java");
      mentoria.setData(LocalDate.now());// informa a data do dia que rodar o arqivo

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp Java Devolop");
        bootcamp.setDescricao(" Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev= new Dev();
        dev.setNome(" Aline");
        dev.InscreverBootcamp(bootcamp);
        System.out.println(dev.getNome()+" conteudos incristos "+dev.getConteudosInscritos());
        dev.progredir();// tirar de conteudos incritos, e incluir nos contluidos. vai tirar um . para tirar mais e so repetir o caomdo
        System.out.println(dev.getNome()+" conteudos incristos "+dev.getConteudosInscritos());
        System.out.println(dev.getNome()+" conteudos Concluidos "+dev.getConteudosConcluidos());
        System.out.println("XP: "+dev.calcularTotalXp());

        System.out.println("**************");
        Dev dev1= new Dev();
        dev1.setNome(" Marcos");
        dev1.InscreverBootcamp(bootcamp);
        System.out.println(dev1.getNome()+" conteudos incristos "+dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println(dev1.getNome()+" conteudos incristos "+dev1.getConteudosInscritos());
        System.out.println(dev1.getNome()+" conteudos Concluidos "+dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev.calcularTotalXp());


    }
}
