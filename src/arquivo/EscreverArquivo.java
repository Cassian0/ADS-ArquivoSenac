/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author silvio.junior
 */
public class EscreverArquivo {

    private static final String PATH = "C:\\Users\\cassiano.schmitz\\Desktop\\exemploJava\\Arquivo.txt";

    public void escrever(String texto) throws IOException {
        LerArquivo ler = new LerArquivo();
        String textoArquivo = ler.lerTexto();
        File file = new File(PATH);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        writer.write(textoArquivo + "\n" + texto);
//        writer.newLine();
        writer.flush();
        writer.close();

        System.out.println("Arquivo gravado em: " + PATH);
    }

    public static void main(String[] args) throws IOException {
        EscreverArquivo ea = new EscreverArquivo();
        ea.escrever(JOptionPane.
                showInputDialog("Digite umn texto"));
    }

}
