package Models;

/**
 *
 * @author 631420049
 */
public class Habilidades {
    private String nomeHab;
    private String descHab;

    public Habilidades(String nomeHab, String descHab) {
        this.nomeHab = nomeHab;
        this.descHab = descHab;
    }

    public String getNomeHab() {
        return nomeHab;
    }

    public String getDescHab() {
        return descHab;
    }

    @Override
    public String toString() {
        return "\n Hab=" + nomeHab + ", Descrição=" + descHab;
    }
    
    
    
    
}
