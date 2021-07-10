package dia12.composicao.televisao;

public class Televisao {

    //    aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
    //    aumentar e diminuir o número do canal em uma unidade
    //    trocar para um canal indicado;
    //    consultar o valor do volume de som e o canal selecionado.

    private Integer volume = 15;

    private Integer canal = 13;



    public void aumentarVolume() {

        if (this.volume == 50) {
            return;
        }
        this.volume++;
    }

    public void diminuirVolume() {
        if (this.volume == 0) {
            return;
        }

        this.volume--;
    }

    public void aumentarCanal() {
       if(this.canal == 100){
           this.canal = 0;
       }else{
           this.canal++;
       }
    }

    public void diminuirCanal() {
        if(this.canal == 1){
            this.canal = 100;
        }else{
            this.canal--;
        }
    }

    public void mudarCanal(Integer canalEscolhido) {
        if(canalEscolhido < 1 || canalEscolhido > 100){
            return;
        }
        this.canal = canalEscolhido;
    }

    public void informacoesDeSomEhDeCanal(){
        System.out.printf("A TV está no canal %d\n", this.canal);
        System.out.printf("A TV está com volume de %d\n", this.volume);
    }
}
