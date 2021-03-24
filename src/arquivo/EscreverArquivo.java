package arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class EscreverArquivo {

    private static String path;

    public EscreverArquivo(String caminho) {
        path = caminho;
    }

    public void escrever(String texto) throws IOException {
        LerArquivo ler = new LerArquivo(path);
        String textoArquivo = ler.lerTexto();
        File file = new File(path);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        writer.write(textoArquivo + "\n" + texto);
//        writer.newLine();
        writer.flush();
        writer.close();

        System.out.println("Arquivo gravado em: " + path);
    }
}
