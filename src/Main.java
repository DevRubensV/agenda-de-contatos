//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato(new Contato("Rubens", "rubens.vilhean22@gmail.com", "98464-6597"));
        agenda.adicionarContato(new Contato("Allana", "alsadashdais", "ajsidjasd"));



        agenda.buscarContato("Rubens");
        agenda.editarNomeContato("Rubens", "Rubão");
    }
}