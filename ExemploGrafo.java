package ADO3ED;

import java.util.Locale;
import java.util.Scanner;

public class ExemploGrafo {
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        Scanner scan = new Scanner(System.in, "UTF-8");
        scan.useLocale(Locale.forLanguageTag("pt-BR"));
        System.setProperty("file.encoding", "UTF-8");

        System.out.println("Digite a estação de partida");
        String partida = scan.nextLine();
        System.out.println(partida);

        System.out.println("Digite a estação de saída");
        String fim = scan.nextLine();
        System.out.println(fim);


        grafo.DijkstraSem(partida,fim);
    }
}
