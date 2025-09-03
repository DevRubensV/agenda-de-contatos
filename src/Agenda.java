import java.util.ArrayList;

public class Agenda {
    //Cria um atributo que é uma lista de contos
    private ArrayList<Contato> contatos;

    //Construtor inicializando a lista
    public Agenda(ArrayList<Contato> contatos) {
        this.contatos = new ArrayList<>();
    }

    //Metodo adicionar contato
    public void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    //Metodo remover contato
    public void removerContato(String nome){
    //-> é o operador da função lambda em Java
    //Nesse caso, para cada contato "c" na lista de contatos,
    //verifica se o nome é igual ao parâmetro recebido.
        contatos.removeIf(d -> d.getNome().equalsIgnoreCase(nome));
    }
}
