public class MemoriaUSB {
    String nome;
    int capacidade;

    MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    void mostraInfo() {
        System.out.println(nome + " - " + capacidade + "Gb");
    }
}
