package tlp;

import Models.Aprendizagem;
import Models.Champions;
import Models.Console1;
import Models.Habilidades;
import Models.Infpatches;
import Models.Itens;
import Models.Mobs;
import java.util.ArrayList;

/**
 *
 * @author 631420049
 */
public class TLP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Itens();
        //Mob();
        //Aprendizagem();
        //InfPatches();
        //Champions();
    }

    public static void Itens() {

        ArrayList<Itens> listaItens = new ArrayList<Itens>();

        Itens item = new Itens("A Lança Negra", "huashiahiuahduihasidhsidh");
        Itens item2 = new Itens("A Lança Negra2", "huashiahiuahduihasidhsidh");
        Itens item3 = new Itens("A Lança Negra3", "huashiahiuahduihasidhsidh");

        listaItens.add(item);
        listaItens.add(item2);
        listaItens.add(item3);

        for (Itens listaItem : listaItens) {
            System.out.println(listaItem);
        }
    }

    public static void Mob() {

        ArrayList<Mobs> listaMobs = new ArrayList<Mobs>();

        Mobs mob1 = new Mobs("Crimson Raptor", "Usando \"smite\" recebe-se visão verdadeira por um curto periodo de tempo");
        Mobs mob2 = new Mobs("Dragon", "Usando \"smite\" invoca um espirito q percorre a selva revelando inimigos proximos porum curto periodo de tempo");
        Mobs mob3 = new Mobs("Greater Murk Wolf", "A cada vez q se elimina o Dragao, recebe-se um buf permanente, acumulando até 5 vezes");

        listaMobs.add(mob1);
        listaMobs.add(mob2);
        listaMobs.add(mob3);

        for (Mobs listaMob : listaMobs) {
            System.out.println(listaMob);
        }
    }

    public static void Aprendizagem() {

        String voltar="v";
        while(voltar.equals("v")){ 

        System.out.println("\t APRENDIZAGEM");
        System.out.println("1 - Objetivo do Jogo! ");
        System.out.println("2 - O que são campeões? ");
        System.out.println("3 - O que são Rotas?");
        System.out.println("4 - O que são Tropas?");
        System.out.println("5 - O que são Torres?");
        System.out.println("6 - O que são Inibidores?");
        System.out.println("7 - O que são Nexus?");
        System.out.println("8 - O que são os Itens?");
        System.out.println("9 - O que é a Selva? ");
        
        
        
       String op= Console1.scanString("Informe a opção desejada : ");

        
        switch (op) {
            case "1":
                System.out.println(Aprendizagem.Oobjetivo());
                break;
            case "2":
                System.out.println(Aprendizagem.Champions());
                break;
            case "3":
                System.out.println(Aprendizagem.Asrotas());
                break;
            case "4":
                System.out.println(Aprendizagem.Astropas());
                break;
            case "5":
                System.out.println(Aprendizagem.Astorres());
                break;
            case "6":
                System.out.println(Aprendizagem.Inib());
                break;
            case "7":
                System.out.println(Aprendizagem.Onexus());
                break;
            case "8":
                System.out.println(Aprendizagem.Item());
                break;
            case "9":
                System.out.println(Aprendizagem.Aselva());
                break;
            default:
                break;
        }
        voltar = Console1.scanString("\n\nDigite 'v' para voltar ou qualquer outra tecla para encerrar! ");
        }

    }

    private static void InfPatches() {
        
        ArrayList<Infpatches> listaPatches = new ArrayList<Infpatches>();
        
        Infpatches ip521 = new Infpatches("Patch 5.21","http://br.leagueoflegends.com/pt/news/game-updates/patch/notas-da-atualizacao-521");
        Infpatches ip520 = new Infpatches("Patch 5.21","http://br.leagueoflegends.com/pt/news/game-updates/patch/notas-da-atualizacao-520");
        Infpatches ip519 = new Infpatches("Patch 5.21","http://br.leagueoflegends.com/pt/news/game-updates/patch/notas-da-atualizacao-519");
        
        listaPatches.add(ip521);
        listaPatches.add(ip520);
        listaPatches.add(ip519);

        for (Infpatches Infpatche : listaPatches) {
            System.out.println(Infpatche);
        }
        
    }

    private static void Champions() {
        Habilidades[] listaHab = new Habilidades[5];
        for (int i = 0; i < 5; i++) {
            Habilidades hab = new Habilidades("Nome","Desc");
            listaHab[i]=hab;
            
        }
        
        Champions champ = new Champions("Aatrox","Lutador","Aatrox é um guerreiro lendário, um dos cinco restantes de uma raça antiga conhecida como Darkin. Ele empunha sua massiva espada com graça e pompa, dilacerando legiões inteiras com um estilo hipnótico a se ","Prós,contras",listaHab);
        
        System.out.println(champ);
        
    }

}
