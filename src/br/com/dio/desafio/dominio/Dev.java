package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoEscritos = new LinkedHashSet<>(); //para salvar os curso na mesma ordem
    private Set<Conteudo>conteudosConcluidos = new LinkedHashSet<>(); // não deia repetir elementos

    public void insvreverBootCampo(BootCampo bootCamp){
        this.conteudoEscritos.addAll(bootCamp.getConteudos()); //adiciona ao set todos os conteudos do bootcamp
        bootCamp.getDevEscritos().add(this); //adiciono o dev ao bootcamp que veio como caparametro
    };

    public void progredir(){
        Optional <Conteudo> conteudo = this.conteudoEscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());  //addiciona em conteudos feitos
            this.conteudoEscritos.remove(conteudo.get()); //remove de conteudos a fazer
        }else {
            System.err.println("Voce não esta inscrito em nem um conteudo");
        }
    };

    public double calcularTotalXp(){
        return this.conteudosConcluidos //pega cada conteudo de dentro do setConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())// e calcula o xp dele
                .sum(); // e soma
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoEscritos() {
        return conteudoEscritos;
    }

    public void setConteudoEscritos(Set<Conteudo> conteudoEscritos) {
        this.conteudoEscritos = conteudoEscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoEscritos, dev.conteudoEscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoEscritos, conteudosConcluidos);
    }
}
