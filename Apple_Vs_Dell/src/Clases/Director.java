public class Director extends Thread {
    private Empresa empresa;
    private int diasrestantes;

    public Director(Empresa empresa) {
        this.empresa = empresa;
    }
}
