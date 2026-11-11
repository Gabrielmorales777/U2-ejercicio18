
import java.util.ArrayList;
import java.util.List;

public class Factura {

    private int numero;
    private String cliente;
    private List<ItemFactura> items;

    public Factura(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemFactura item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemFactura item : items) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public List<ItemFactura> getItems() {
        return items;
    }
}
