
package projetopessoal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ManipulaArquivo {
    
    
    
    public static void gravar(String nome, String senha)throws IOException{
        FileWriter arquivoSaida = new FileWriter("guardar.txt", true);
        PrintWriter out = new PrintWriter(arquivoSaida);
        
        out.println("Nome do site: " + nome + "\n Senha: " + senha);
        
        out.close();
        arquivoSaida.close();
    }
}
