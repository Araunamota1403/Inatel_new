public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwares = new HardwareBasico[3];
    MemoriaUSB memoriaUSB;

    void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        for (HardwareBasico h : hardwares)
            System.out.println(h.nome + " - " + h.capacidade);
        sistemaOperacional.mostraInfo();
        memoriaUSB.mostraInfo();
    }
}
