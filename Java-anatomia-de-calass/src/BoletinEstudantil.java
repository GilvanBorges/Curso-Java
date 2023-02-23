public class BoletinEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if(mediaFinal<6)
            System.out.println("REPROVADO!");
        else if (mediaFinal ==6)
            System.out.println("Prova de MINERVA");
        else 
            System.out.println("APROVADO");
    }
}
