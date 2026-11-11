
public class Main {

    public static void main(String[] args) {


        ImpresoraFiscal impresora = new ImpresoraFiscal();


        CajaRegistradora caja = new CajaRegistradora(impresora);


        Factura factura = new Factura(1001, "Cliente");


        factura.agregarItem(new ItemFactura("Hamburguesa", 2, 4500));
        factura.agregarItem(new ItemFactura("Gaseosa", 2, 1500));
        factura.agregarItem(new ItemFactura("Papas fritas", 1, 2500));


        caja.cerrarVenta(factura);
    }
}
