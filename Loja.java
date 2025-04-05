import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matricula = 1234;

        Computador promo1 = new Computador();
        promo1.marca = "Apple";
        promo1.preco = matricula;
        promo1.hardwares[0] = new HardwareBasico("Pentium Core i3", 2200);
        promo1.hardwares[1] = new HardwareBasico("Memória RAM", 8);
        promo1.hardwares[2] = new HardwareBasico("HD", 500);
        promo1.sistemaOperacional = new SistemaOperacional("Linux Ubuntu", 32);
        promo1.memoriaUSB = new MemoriaUSB("Pen-drive", 16);

        Computador promo2 = new Computador();
        promo2.marca = "Samsung";
        promo2.preco = matricula + 1234;
        promo2.hardwares[0] = new HardwareBasico("Pentium Core i5", 3370);
        promo2.hardwares[1] = new HardwareBasico("Memória RAM", 16);
        promo2.hardwares[2] = new HardwareBasico("HD", 1000);
        promo2.sistemaOperacional = new SistemaOperacional("Windows 8", 64);
        promo2.memoriaUSB = new MemoriaUSB("Pen-drive", 32);

        Computador promo3 = new Computador();
        promo3.marca = "Dell";
        promo3.preco = matricula + 5678;
        promo3.hardwares[0] = new HardwareBasico("Pentium Core i7", 4500);
        promo3.hardwares[1] = new HardwareBasico("Memória RAM", 32);
        promo3.hardwares[2] = new HardwareBasico("HD", 2000);
        promo3.sistemaOperacional = new SistemaOperacional("Windows 10", 64);
        promo3.memoriaUSB = new MemoriaUSB("HD Externo", 1000);

        Cliente cliente = new Cliente();
        System.out.print("Digite seu nome: ");
        cliente.nome = sc.nextLine();
        System.out.print("Digite seu CPF: ");
        cliente.cpf = sc.nextLine();

        int opcao;
        do {
            System.out.println("\nPromoções disponíveis:");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar compra");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1: cliente.comprar(promo1); break;
                case 2: cliente.comprar(promo2); break;
                case 3: cliente.comprar(promo3); break;
                case 0: break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        cliente.mostraCompra();
        sc.close();
    }
}
