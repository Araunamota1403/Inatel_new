public class SistemaOperacional {
    String nome;
    int tipo;

    SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    void mostraInfo() {
        System.out.println("Sistema: " + nome + " - " + tipo + " bits");
    }
}
