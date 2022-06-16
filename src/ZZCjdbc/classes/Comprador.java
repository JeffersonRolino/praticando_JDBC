package ZZCjdbc.classes;

public class Comprador {
    private int id;
    private String cpf;
    private String nome;

    public Comprador(){

    }

    public Comprador(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Comprador(int id, String cpf, String nome) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comprador comprador = (Comprador) o;

        return id == comprador.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
