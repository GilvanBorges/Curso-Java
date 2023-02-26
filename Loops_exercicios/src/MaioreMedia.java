import java.util.Scanner;

public class MaioreMedia {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

            int numero;
            int maior = 0;
            int soma = 0;
            int count = 0;

            do{
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            count = count+1;   

           } while(count < 5);
           System.out.println("Maior numero é : " + maior);
           System.out.println("A média entre os valores é : " + soma/5);
        }
    
    }
}
