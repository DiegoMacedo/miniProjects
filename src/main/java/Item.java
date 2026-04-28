import java.util.ArrayList;
import java.util.List;

public class Item {
    private static final List<Item> LISTAPRODUTO = new ArrayList<>();
    private String nome;
    private double valor;


    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Item() {
    }

    public void addProduto(Item item) {
        LISTAPRODUTO.add(item);

    }

    public void listarProduto() {
        for (Item items : LISTAPRODUTO) {
            System.out.println("Nome: " + items.nome + " | " + "Valor: " + items.valor);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
