import java.io.*;
import java.util.Scanner;

public class Exercicio2Character {
public static void lerTecladoEscreverDocumento() throws IOException {
    PrintWriter pw = new PrintWriter(System.out);
    pw.println("digite 3 recomendacoes de filmes");
    pw.flush();

    Scanner scan = new Scanner(System.in);
    String line = scan.nextLine();

    File f = new File("recomendações.txt");

    BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

    do {

        bw.write(line);
        bw.newLine();
        line = scan.nextLine();


    }while (line.equalsIgnoreCase("fim"));
       bw.flush();

       pw.println("Arquivo \"%s\" foi criado com sucesso: ");

       pw.close();
       scan.close();
       bw.close();
}

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();

    }

}
