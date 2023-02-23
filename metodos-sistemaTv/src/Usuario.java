public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Canal autal: " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal autal: " +smartTv.canal);

        System.out.println("Volume atual: " +smartTv.volume );

        System.out.println("Tv ligada? " +smartTv.ligada);
        System.out.println("Canal autal: " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume );

        smartTv.ligar();
        System.out.println("Novo status---> Tv ligada? " +smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status---> Tv ligada? " +smartTv.ligada);
    }
}
