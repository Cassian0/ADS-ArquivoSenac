/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivo {

    public String lerTexto() throws IOException {
        String texto = "";
        Path path = Paths.get("C:\\Users\\cassiano.schmitz\\Desktop\\exemploJava\\Arquivo.txt");
        List<String> linhasArquivo = Files.readAllLines(path);
        for (String linha : linhasArquivo) {
            texto += linha + "\n";
        }
        return texto;
    }
}
