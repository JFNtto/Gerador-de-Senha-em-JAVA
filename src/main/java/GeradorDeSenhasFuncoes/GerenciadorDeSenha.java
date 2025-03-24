
package GeradorDeSenhasFuncoes;

import java.security.SecureRandom;


public class GerenciadorDeSenha {
    private static final String ListaMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ListaMinusculas = "abcdefghijklmnopqrstuvwxyz";
    private static final String ListaSimbolos = "?=+-_*&%$#@!<)(>";
    private static final String ListaNumeros = "1234567890";
    
    
    public String PegaInfo(int tamanho, boolean maiusculas, boolean minusculas, boolean simbolos, boolean numeros){
        StringBuilder OqueVaiTer = new StringBuilder(tamanho);
        
        if(maiusculas){
            OqueVaiTer.append(ListaMaiusculas);
        }if(minusculas){
            OqueVaiTer.append(ListaMinusculas);
        }if(simbolos){
            OqueVaiTer.append(ListaSimbolos);
        }if(numeros){
            OqueVaiTer.append(ListaNumeros);
        }
        
        
        return GerarSenha(OqueVaiTer.toString(), tamanho);
    }
    
    
    public String GerarSenha(String string, int tamanho){
        SecureRandom random = new SecureRandom();
        StringBuilder senhaFinal = new StringBuilder(tamanho);
        
        for(int i = 0; i < tamanho; i ++){
            int caracter = random.nextInt(string.length());
            senhaFinal.append(string.charAt(caracter));
            
        }
        
        return senhaFinal.toString();
    }
}
