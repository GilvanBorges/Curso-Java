import java.util.Random;

public class NumAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int numAleatorio[] = new int [6];

        for (int i = 0; i<numAleatorio.length; i++) {
            int numero = random.nextInt(60);
            numAleatorio[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numAleatorio) {
            System.out.println(numero + " ");
        }

        System.out.println("\nSucessores numeros Aleatorios: ");
        for (int numero : numAleatorio) {
            System.out.println((numero+1) +" ");
        }
    }
}
