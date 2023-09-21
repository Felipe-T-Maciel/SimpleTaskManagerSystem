import java.util.ArrayList;

public class Usuario {

    private String nome;
    private int idade;

    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Projeto> projetos = new ArrayList<>();

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
