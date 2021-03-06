package br.com.utfpr.jpa.biblioteca.modelo;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
public class Sessao extends AbstractPersistable<Long> {

    private String codigoSesao;
    private String descricao;
    private String localizacao;

    public String getCodigoSesao() {
        return codigoSesao;
    }

    public void setCodigoSesao(String codigoSesao) {
        this.codigoSesao = codigoSesao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
