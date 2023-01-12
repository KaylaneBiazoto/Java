package exerciciosgui;

public class Pessoa {
    
    private String nome;
    private String sobrenome;
    private String email;
    private String cpf;
    private String rg;
    private String data;

    public Pessoa(String nome, String sobrenome, String email, String cpf, String rg, String data) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
        this.data = data;
        this.email = email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    String[] array = {nome, sobrenome, rg, cpf, data,email};
}
