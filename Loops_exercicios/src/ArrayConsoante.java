import java.util.Scanner;

public class ArrayConsoante {
    public static void main(String[] args) {
       try(Scanner scanner = new Scanner(System.in)){;

        String[] consoantes = new String[6];
        int quantidadeConsoante = 0;

        int count = 0;
        do{
            System.out.println("Digite uma letra: ");
            String letra =scanner.next();

            if(!(letra.equalsIgnoreCase("a") |
                 letra.equalsIgnoreCase("e") |
                 letra.equalsIgnoreCase("i") |
                 letra.equalsIgnoreCase("o") |
                 letra.equalsIgnoreCase("u"))) {
            consoantes[count] = letra;
            quantidadeConsoante++;
                 }
                 count++;
        }while(count < consoantes.length);

       for (String consoante: consoantes) {
            if (consoante != null)
            System.out.println(consoante + " ");
            
       }
       System.out.println("Quantidade de consoantes: " + quantidadeConsoante);
        System.out.println(consoantes.length);
      }
    }
}
