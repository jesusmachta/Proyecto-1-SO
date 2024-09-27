public class ProjectManager extends Thread {
    private Empresa empresa;
    private int diasrestantes;

    public ProjectManager(Empresa empresa) {
        this.empresa = empresa;
    }
}
