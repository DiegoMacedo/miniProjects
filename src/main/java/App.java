import java.util.List;
import java.util.Scanner;

public class App {
    private static final Menu MENU = new Menu();
    private static final Scanner TECLADO = new Scanner(System.in);

    static void main() {

        int opcao = -1;

        do {
            MENU.menuSistema();
            opcao = Integer.parseInt(TECLADO.nextLine());
            switch (opcao) {
                case 1 -> System.out.println("Realizar venda");
                case 2 -> cadastrar();
                case 3 -> listarProdutos();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Escolha uma opção válida!");
            }
        } while (opcao != 0);
    }

    public static void cadastrar() {

        System.out.println("informe o nome do ítem a ser cadastrado: ");
        String nome = TECLADO.nextLine();
        System.out.println("Informe o valor do ítem a ser cadastrado: ");
        double valor = Double.parseDouble(TECLADO.nextLine());

        Item item = new Item(nome, valor);
        item.addProduto(item);
        System.out.println("Item cadastrado com sucesso! -> " + item.getNome());

    }
    public static void listarProdutos(){
        Item item = new Item();
        item.listarProduto();
    }

}
