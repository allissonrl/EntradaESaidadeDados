import java.io.*;

public class ExemploIOBytes {
    public static void copiarArquivo() throws IOException {
        File f = new File("C:\Users\Rosea\Downloads\EntradaESaidadeDados\recomendaçõescopy.txt");
        String nomeArquivo = f.getName();

//        InputStream is = new FileInputStream(f.getName());
//        BufferedInputStream  bis = new BufferedInputStream(is);
        BufferedInputStream bis = new BufferedInputStream( new FileInputStream(f.getName()));

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("copy2.txt");
        File fCopy = new File(nomeArquivoCopy);

        BufferedInputStream bos = new BufferedInputStream(new FileInputStream(nomeArquivoCopy));
            int line = 0;
            while ((line = bis.read()) != -1) {
             bos.write((char)line);
             bos.flush();
        }
            bis.close();
            bos.close();

            PrintStream ps = new PrintStream(System.out);
        System.out.println("Arquivo copiado com sucesso");
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
