import java.io.*;
import java.util.Scanner;

public class Exercicio1Character {

    public static void receberTecladoImprimirConsole() throws IOException {
//        InputStream is = System.in;
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);

        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(!(line.isEmpty()));
        bw.flush();

         bw.close();
         bw.close();
    }


    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }

}
