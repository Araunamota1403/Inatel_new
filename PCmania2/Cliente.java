public class Cliente {
    String nome;
    String cpf;
    Computador[] carrinho = new Computador[10];
    int qtdComputadores = 0;

    void comprar(Computador c) {
        if (qtdComputadores < carrinho.length)
            carrinho[qtdComputadores++] = c;
    }

    void mostraCompra() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        float total = 0;
        for (int i = 0; i < qtdComputadores; i++) {
            System.out.println("\nComputador " + (i + 1));
            carrinho[i].mostraPCConfigs();
            total += carrinho[i].preco;
        }
        System.out.println("\nTOTAL: R$ " + total);
    }
}
