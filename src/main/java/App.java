import java.util.Scanner;

public class App {
    private static final Menu MENU = new Menu();
    private static final Scanner TECLADO = new Scanner(System.in);

    static void main() {

        String opcao = "-1";

        do {
            MENU.menuSistema();
            opcao = TECLADO.nextLine().trim();
            switch (opcao) {
                case "1" -> realizarVenda();
                case "2" -> System.out.println("Cadastrar produto");
                case "3" -> System.out.println("Estoque");
                case "0" -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Escolha uma opção válida!");
            }
        } while (!opcao.equals("0"));
    }

    public static void realizarVenda() {
        MENU.tipoCliente();
        String escolha = TECLADO.nextLine().trim();
        switch (escolha) {
            case "1" -> calcularVip();
            case "2" -> calcularRegular();
            case "3" -> calcularNovo();
            case "0" -> MENU.menuSistema();
            default -> System.out.println("Digite uma opção válida");
        }
    }

    public static void calcularVip() {
        System.out.println("Informe o nome do produto: ");
        String nome = TECLADO.nextLine().trim().toUpperCase();
        System.out.println("Informe o valor do produto: ");
        double valor = Double.parseDouble(TECLADO.nextLine().trim());
        System.out.println("Informe a quantidade: ");
        int quantidade = Integer.parseInt(TECLADO.nextLine().trim());

        Item item = new Item(nome, valor, quantidade);
        double total = item.valor() * item.quantidade();
        double desconto = total * 0.15;
        double valorVenda = total - desconto;

        if (valorVenda > 500) {
            System.out.printf("Produto: %s | Valor total:R$ %s | Desconto:R$ %s | Valor final:R$ %s", item.nome(), total, desconto, valorVenda);
        } else {
            double totalComFrete = valorVenda + 20;
            System.out.printf("Produto: %s | Valor total:R$ %s | Desconto:R$ %s | Valor final com frete:R$ %s", item.nome(), total, desconto, totalComFrete);
        }
    }

    public static void calcularRegular() {
        System.out.println("Informe o nome do produto: ");
        String nome = TECLADO.nextLine().trim().toUpperCase();
        System.out.println("Informe o valor do produto: ");
        double valor = Double.parseDouble(TECLADO.nextLine().trim());
        System.out.println("Informe a quantidade: ");
        int quantidade = Integer.parseInt(TECLADO.nextLine().trim());
        Item item = new Item(nome, valor, quantidade);
        double total = item.valor() * item.quantidade();
        double desconto = total * 0.5;

        if (total > 100) {
            double valorVenda = total - desconto;
            if (valorVenda > 500) {
                System.out.printf("Produto: %s | Valor total:R$ %s | Desconto:R$ %s | Valor final:R$ %s", item.nome(), total, desconto, valorVenda);
            } else {
                double totalComFrete = valorVenda + 20;
                System.out.printf("Produto: %s | Valor total:R$ %s | Desconto:R$ %s | Valor final com frete:R$ %s", item.nome(), total, desconto, totalComFrete);
            }
        } else {
            double valorVenda = total;
            System.out.printf("Produto: %s | Valor total:R$ %s | Desconto:R$ %s | Valor final:R$ %s", item.nome(), total, desconto, valorVenda);
        }
    }

    public static void calcularNovo() {
        System.out.println("Informe o nome do produto: ");
        String nome = TECLADO.nextLine().trim().toUpperCase();
        System.out.println("Informe o valor do produto: ");
        double valor = Double.parseDouble(TECLADO.nextLine().trim());
        System.out.println("Informe a quantidade: ");
        int quantidade = Integer.parseInt(TECLADO.nextLine().trim());
        Item item = new Item(nome, valor, quantidade);

        double total = item.valor() * item.quantidade();
        if (total > 500) {
            System.out.printf("Produto: %s | Valor total:R$ %s ", item.nome(), total);
        } else {
            double totalComFrete = total + 20;
            System.out.printf("Produto: %s | Valor total:R$ %s | Valor final com frete:R$ %s", item.nome(), total, totalComFrete);
        }

    }
}
