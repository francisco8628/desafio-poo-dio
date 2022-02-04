package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCampo {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial  = LocalDate.now();
    private final LocalDate dataFinal  = dataInicial.plusDays(45); //acrescenta 45 a data inicial
    private Set<Dev> devEscritos = new HashSet<>();  // não guarda a posição dos Devs inseridos
    private Set<Conteudo> conteudos = new LinkedHashSet<>(); //sguarda a ordem

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevEscritos() {
        return devEscritos;
    }

    public void setDevEscritos(Set<Dev> devEscritos) {
        this.devEscritos = devEscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCampo bootCampo = (BootCampo) o;
        return Objects.equals(nome, bootCampo.nome) && Objects.equals(descricao, bootCampo.descricao) && Objects.equals(dataInicial, bootCampo.dataInicial) && Objects.equals(dataFinal, bootCampo.dataFinal) && Objects.equals(devEscritos, bootCampo.devEscritos) && Objects.equals(conteudos, bootCampo.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devEscritos, conteudos);
    }
}
