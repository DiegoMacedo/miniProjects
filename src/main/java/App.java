import java.util.Scanner;

public class App {
    private static final Menu MENU = new Menu();

    static void main() {
        int opcao = -1;
        try (Scanner teclado = new Scanner(System.in)) {
            do {
                MENU.menuSistema();
                opcao = Integer.parseInt(teclado.nextLine());
                switch (opcao) {
                    case 1 -> System.out.println("Realizar venda");
                    case 2 -> System.out.println("Cadastrar produto");
                    case 3 -> System.out.println("Estoque produto");
                    case 0 -> System.out.println("Saindo do sistema...");
                    default -> System.out.println("Escolha uma opção válida!");
                }
            } while (opcao != 0);
        }
    }
}
