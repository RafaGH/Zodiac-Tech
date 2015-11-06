package Models;

import java.util.Arrays;

/**
 *
 * @author 631420049
 */
public class Champions {
    
    private String nome;
    private String classe;
    private String historia;
    private String dicas;
    private Habilidades[] habilidades;

    public Champions(String nome, String classe, String historia, String dicas, Habilidades[] habilidades) {
        this.nome = nome;
        this.classe = classe;
        this.historia = historia;
        this.dicas = dicas;
        this.habilidades = habilidades;
    }


    @Override
    public String toString() {
        return "Champions \n " + "nome=" + nome + ", classe=" + classe + ", habilidades=" + Arrays.toString(habilidades) ;
    }
    
    
    
   
    
}
