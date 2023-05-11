import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        String[] linhas = new String[] {"Good morning", "Good afternoon", "Good nigth"}; // Vetor linhas do tipo String. 
        
        String path = "c:\\temp\\out.txt"; // Caminho do arquivo que será criado e o nome que ele terá.

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // Cria o arquivo ou recria, caso já exista.
        	for (String linha : linhas) {
        		bw.write(linha); // Escreve no arquivo o valor de (linha).
        		bw.newLine(); // Cria uma nova linha no arquivo.
        	}
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}