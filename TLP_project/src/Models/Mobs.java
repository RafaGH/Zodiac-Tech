package Models;

/**
 *
 * @author 631420049
 */
public class Mobs {
    private String nome;
    private String desc;

    public Mobs(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Mobs{" + "nome=" + nome + ", desc=" + desc + '}';
    }
    
    
}
