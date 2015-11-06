package Models;

/**
 *
 * @author 631420049
 */
public class Itens {
    private String nome;
    private String desc;

    public Itens(String nome, String desc) {
        this.nome = nome;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Itens{" + "nome=" + nome + ", desc=" + desc + '}';
    }
    
    
    
}
