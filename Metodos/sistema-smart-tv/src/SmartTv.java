public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar() {
        ligada = true;
    };

    public void desligar() {
        ligada = false;
    }; 

    public void AumentarVolume () {
        volume++;
        System.out.println("aumentar volume para: " + volume);
    };

    public void DiminuirVolume () {
        volume--;
        System.out.println("diminuir volume para: " + volume);
    };

    public void AumentarCanal() {
        canal++;
    };

    public void DiminuirCanal() {
        canal--;
    };

    public void MudarCanal(int novoCanal) {
        canal = novoCanal;
    };
}
