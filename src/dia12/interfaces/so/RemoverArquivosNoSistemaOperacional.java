package dia12.interfaces.so;

public class RemoverArquivosNoSistemaOperacional implements Linux {
    @Override
    public void runCommandOnLinux() {
        System.out.println("rm");
    }

}
