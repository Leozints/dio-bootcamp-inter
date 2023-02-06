public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("tv ligada? " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);

        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.DiminuirVolume();

        System.out.println("canal atual: " + smartTv.canal);

        smartTv.MudarCanal(17);
        System.out.println("canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.AumentarCanal();
        smartTv.AumentarCanal();
        System.out.println("canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smartTv.ligada);
    };
};
