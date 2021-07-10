package dia12.interfaces.so;

public class ListarArquivosNoSistemaOperacional implements Linux, Windows {
    @Override
    public void runCommandOnLinux() {
        System.out.println("ls");
    }

    @Override
    public void runCommandOnWindows() {
        System.out.println("dir");
    }
}
