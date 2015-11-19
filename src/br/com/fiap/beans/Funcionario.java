package br.com.fiap.beans;

/**
 * Created by
 *
 * @author vinylimaz
 *         on 19/11/15 & 13:22.
 *         Funcionario é uma classe
 */
public class Funcionario {

    private short cod;
    private String nome;
    private String cargo;

    public Funcionario(short cod, String nome, String cargo) {
        this.cod = cod;
        this.nome = nome;
        this.cargo = cargo;
    }

    public Funcionario() {
    }

    public short getCod() {
        return cod;
    }

    public void setCod(short cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
