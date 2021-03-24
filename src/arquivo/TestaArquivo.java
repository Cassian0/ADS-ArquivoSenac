package arquivo;

import java.io.IOException;
import javax.swing.JOptionPane;

public class TestaArquivo {

    public static void main(String[] args) throws IOException {
        LerArquivo lerArquivo = new LerArquivo("");
        EscreverArquivo escreverArquivo = new EscreverArquivo("C:\\Users\\cassiano.schmitz\\Desktop\\exemploJava\\Arquivo.txt");
        String menu;
        do {
            menu = JOptionPane.
                    showInputDialog("Digite: \n(1)Ler \n(2)Escrever"
                            + "\n(3)Sair");
            switch (menu) {
                case "1":
                    System.out.println(lerArquivo.lerTexto());
                    break;

                case "2":
                   String texto = JOptionPane.showInputDialog("Digite alguma coisa");
                    escreverArquivo.escrever(texto);
                    break;

                case "3":
                    break;
            }

        } while (!menu.equals("3"));
    }

}
