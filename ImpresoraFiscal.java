
public class ImpresoraFiscal {

    public void imprimirDocumento(Factura factura) {

        System.out.println("==============================");
        System.out.println("       RESTAURANTE");
        System.out.println("       TICKET FISCAL");
        System.out.println("==============================");

        System.out.println("Factura N°: " + factura.getNumero());
        System.out.println("Cliente: " + factura.getCliente());

        System.out.println("------------------------------");

        for (ItemFactura item : factura.getItems()) {

            System.out.println("Producto: " + item.getDescripcion());
            System.out.println("Cantidad: " + item.getCantidad());

            System.out.printf("Precio: $%.2f%n", item.getPrecioUnitario());

            System.out.printf("Subtotal: $%.2f%n",
                    item.calcularSubtotal());

            System.out.println("------------------------------");
        }

        System.out.printf("TOTAL: $%.2f%n", factura.calcularTotal());

        System.out.println("==============================");
        System.out.println("    GRACIAS POR SU COMPRA");
        System.out.println("==============================");
    }
}
