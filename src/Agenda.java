import java.util.ArrayList;

public class Agenda {
    //Cria um atributo que é uma lista de contos
    private ArrayList<Contato> contatos;

    //Construtor inicializando a lista
    public Agenda() {
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
        contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public Contato buscarContato(String nome) {
        for (Contato c:contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        System.out.println("Contato não encontrado!");
        return null;
    }

    public void listarContatos(){
        for (Contato c:contatos){
            System.out.println(c);
        }
    }

    public void editarNomeContato(String nome, String novoNome){
        for (Contato c:contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNome(novoNome);
                System.out.println(c);
            }
        }
    }
}
