package dia12.composicao.televisao;

public class Controle {

    //    aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
    //    aumentar e diminuir o número do canal em uma unidade
    //    trocar para um canal indicado;
    //    consultar o valor do volume de som e o canal selecionado.

    private Televisao televisao;


    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }

    public void aumentarVolume() {
        this.televisao.aumentarVolume();
    }

    public void diminuirVolume() {
        this.televisao.diminuirVolume();
    }

    public void aumentarCanal() {
        this.televisao.aumentarCanal();
    }

    public void diminuirCanal() {
        this.televisao.diminuirCanal();
    }

    public void mudarCanal(Integer canalEscolhido) {
        this.televisao.mudarCanal(canalEscolhido);
    }

    public void informacoesDeSomEhDeCanal() {
        this.televisao.informacoesDeSomEhDeCanal();
    }

    public static void main(String[] args) {
        Televisao samsung = new Televisao();
        Televisao lg = new Televisao();

        Controle controle = new Controle();

        System.out.println("------------SAMSUNG-------------");
        controle.setTelevisao(samsung);

        controle.aumentarVolume();

        controle.informacoesDeSomEhDeCanal();
        System.out.println();

        controle.diminuirCanal();

        controle.informacoesDeSomEhDeCanal();
        System.out.println();

        controle.mudarCanal(7);

        controle.informacoesDeSomEhDeCanal();

        System.out.println("------------LG-------------");

        controle.setTelevisao(lg);
        controle.informacoesDeSomEhDeCanal();
        System.out.println();

        controle.diminuirVolume();
        controle.aumentarCanal();

        controle.informacoesDeSomEhDeCanal();

        System.out.println("------------Vendo as informações pela própria TV-------------");
        System.out.println("Samsung");
        samsung.informacoesDeSomEhDeCanal();
        System.out.println("\nLG");
        lg.informacoesDeSomEhDeCanal();



    }

}
