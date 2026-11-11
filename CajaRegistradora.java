
public class CajaRegistradora {

    private ImpresoraFiscal impresora;

    public CajaRegistradora(ImpresoraFiscal impresora) {
        this.impresora = impresora;
    }

    public void cerrarVenta(Factura factura) {

        System.out.println("Cerrando venta...");
        System.out.println("Enviando factura a la impresora...");

        impresora.imprimirDocumento(factura);
    }
}
