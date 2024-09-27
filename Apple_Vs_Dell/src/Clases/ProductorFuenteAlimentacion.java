public class ProductorFuenteAlimentacion extends Thread {
    private int id;
    private int capacidadAlmacen;
    private int produccionDiaria;
    private int ultimoNumeroCarnet;
    private Almacen almacen;

    public ProductorFuenteAlimentacion(int id, int capacidadAlmacen, int produccionDiaria, int ultimoNumeroCarnet, Almacen almacen) {
        this.id = id;
        this.capacidadAlmacen = capacidadAlmacen;
        this.produccionDiaria = produccionDiaria;
        this.ultimoNumeroCarnet = ultimoNumeroCarnet;
        this.almacen = almacen;
    }
}
