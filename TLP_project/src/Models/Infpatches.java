package Models;

/**
 *
 * @author 631420049
 */
public class Infpatches {
    private String nome;
    private String link;

    public Infpatches(String nome, String link) {
        this.nome = nome;
        this.link = link;
    }
    @Override
    public String toString() {
        return "Infpatches{" + "nome=" + nome + ", link=" + link + '}';
    }
    
}
