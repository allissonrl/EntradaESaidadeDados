import java.io.*;

public class Exercicio3Parte1Character {

    public static void copiarArquivo() throws IOException {

        File f = new File("C:\\Users\\Rosea\\Downloads\\EntradaESaidadeDados\\recomendações.txt");
        String nameArquivo = f.getName();

//        Reader r = new FileReader(nameArquivo);
//        BufferedReader br = new BufferedReader();
        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));
        String line = br.readLine();
        String nameArquiboCopy = nameArquivo.substring(0, nameArquivo.indexOf(".")).concat("copy.txt");

        File fcopy = new File(nameArquiboCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
                bw.flush();
        }while (!(line == null));

            PrintWriter pw = new PrintWriter(System.in);
            pw.println("Recomende 3 livros: ");
            pw.flush();

            adicinarInfoNoArquivo(fcopy.getName());

            pw.println("ok.tudo certo");

            br.close();
            bw.close();
            pw.close();
    }

    public static void adicinarInfoNoArquivo(String arquivo){}
        BufferedReader br = new BufferedReader(new  InpuntStreamReader(System.in));



    String line = br.readLine();

    BufferedWriter bw = new BufferedWriter((new FileWriter(arquivo)));


    do{
        bw.write(line);
        bw.newLine();
        line = br.readLine();

    }while(!(line.equalsIgnoreCase("fim")));
    br.close;
    bw.close;
    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
