import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("Tabuada: *");
             int tabuada = scanner.nextInt();

             System.out.println("===============================================");
             System.out.println("Tabuada "+ tabuada);
             System.out.println("===============================================");

             for(int i = 1; i<=10; i++){
            System.out.println(tabuada+" x " + i + "=" + (tabuada*i));

             }
        }
    }
}
