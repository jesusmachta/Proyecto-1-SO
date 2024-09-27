public class Director extends Thread {
    private Empresa empresa;
    private int diasRestantes;

    public Director(Empresa empresa) {
        this.empresa = empresa;
    }
}
