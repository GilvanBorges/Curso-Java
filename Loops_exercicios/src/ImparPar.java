import java.util.Scanner;
public class ImparPar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            int quantNumeros;
            System.out.println("Quantidades de numeros: ");
            quantNumeros = scanner.nextInt();

            int count = 0;
            int numero;
            int quantImpar = 0, quantPar = 0;

            do{
                System.out.println("Número : ");
                numero= scanner.nextInt();
                count++;

                if(numero % 2 == 0) quantPar++;
                else quantImpar++;

            }while(count < quantNumeros );

            System.out.println("Quantidades de numeros Impares: " + quantImpar);
            System.out.println("Quantidades de numeros Pares: "+ quantPar);
        }
    }
}
