package Models;

/**
 *
 * @author 631420049
 */
public class Aprendizagem {
    
    private static  String campeoes, inibidores, itens, nexus,objetivo,rotas,selva,torres,tropas;
    
    public static String Champions(){
        campeoes = "\nLeague of Legends está cheio de campeões de vários tipos, de mentes malignas a monstros épicos."
                + "\n Diferentes campeões assumem diferentes papéis e usam diferentes estratégias,"
                + "\n por isso não desanime se o primeiro que você tentar não se adequar ao seu estilo de jogo.";
        return campeoes;
    }
    
    public static String Inib(){
        inibidores = "\nEstruturas importantes conhecidas como inibidores estão localizadas onde as rotas se ligam à base nos dois lados do mapa."
                + "\n Destruir um inibidor cria uma poderosa super-tropa toda vez que novas tropas surgem na rota."
                + "\n Super-tropas são extremamente resistentes, ideais para liderar a investida contra o nexus inimigo.\n"
                + " Os inibidores ressurgem depois de cinco minutos — aproveite sua vantagem nesse intervalo.\n"
                + "Destruir os três inibidores de um inimigo fará com que surjam duas super-tropas em cada rota"
                + "\n toda vez que tropas são criadas.";
        
        return inibidores;
    }
    public static String Item(){
        itens = "\nNuma partida de League of Legends, seu campeão ganha Ouro destruindo unidades e estruturas inimigas."
                + "\n Aplicar o golpe final numa tropa ou campeão, assistência ao matar um campeão e adquirir certas runas ou itens\n"
                + " são apenas algumas maneiras de gerar Ouro extra. Você pode usá-lo para comprar poderosos itens na loja junto à plataforma\n"
                + " do invocador. Basta clicar na loja ou no botão próximo ao seu total de Ouro para abri-la.\n"
                + "Os itens concedem bônus assim que são comprados, não é preciso equipá-los\n" 
                + "Diferentes campeões e estilos de jogo são beneficiados por diferentes combinações de itens,"
                + "\n por isso suas compras devem ser orientadas pela sua estratégia\n" 
                + "Os itens mais poderosos são criados por meio de combinações de itens menores,\n"
                + " não hesite em comprar itens componentes\n" 
                + "Itens consumíveis, tais como poções, sentinelas e itens que requerem ativação,\n"
                + " são usados ao se clicar no inventário ou por meio dos atalhos 1 - 6";
        
          return itens;
    }
    public static String Onexus(){
        nexus = "\nNo coração de cada base fica o Nexus. Protegido por duas Torres, "
                + "\n o Nexus é a estrutura responsável por fazer surgir tropas periodicamente nas rotas."
                + "\n Quando uma equipe destrói o Nexus inimigo, o jogo termina e a equipe é declarada vitoriosa.";
        
        return nexus;
    }
    public static String Asrotas(){
        rotas = "\nExistem três caminhos que conectam sua base à do inimigo. \n"
                + "Esses caminhos são chamadas rotas, e é por elas que as equipes inimigas se encontram.\n"
                + " Para vencer a partida, você deve avançar pela rota até o coração da base inimiga e destruir o nexus.";
        
        return rotas;
    }
    public static String Aselva(){
        selva = "\nEntre as rotas, fica a selva, uma expansão repleta de monstros neutros.\n"
                + " Esses monstros não atacam a base inimiga, mas podem ser derrotados para se obter Ouro e efeitos temporários.\n"
                + " Um jogador pode assumir o papel de caçador da selva e usar essas áreas como sua principal fonte de recursos.\n"
                + " Caçadores da selva geralmente vagam entre as rotas, ajudando os aliados quando necessário";
        
        return selva;
    }
    public static String Astorres(){
        torres = "\nAs Torres são poderosas estruturas defensivas que guardam as rotas distribuídas a intervalos regulares,\n"
                + " atacando os inimigos que se aproximam com rajadas letais de energia.\n"
                + " Como as tropas, elas preferem atacar outros alvos a você, a menos que você comece a lutar com outro campeão\n"
                + " dentro da área de alcance. Uma Torre hostil só ataca você se você estiver atacando um campeão inimigo ou se \n"
                + "você for o último alvo ao alcance. Evite começar uma luta debaixo de uma Torre inimiga.";
        
        return torres;
    }
    public static String Oobjetivo(){
        objetivo = "\nO Jogo se baseia numa partida de 5 jogadores contra 5(jogadores ou IA) no modo normal,\n"
                + " tem também modo de 3 v 3.Em ambos os modos cada jogador escolhe um campeão para a partida,\n"
                + " nela cada time tem que defender sua base, e tentar destruir a base do time oponente.\n"
                + " No mapa normal(5v5) há 3 rotas principais, cada time conta com tropas controladas por IA,\n"
                + " torres defensivas posicionadas pelas rotas, alem da selva onde há monstrons neutros que podem ser caçados.\n"
                + " Durante o jogo a estrategia é evoluir seu campeao,\n"
                + " conseguindo experiencia e ouro ao abater ou ajudar a abater outras unidades,n"
                + " sejam as tropas, monstros neutrais, torres ou campeões adversarios.\n"
                + " Com o ouro recebido se compram itens durante a partida\n"
                + " que almentam os atributos e/ou concedem habilidades especiais ao seu campeão.\n"
                + " O que ajuda e muito a alcançar o objetivo final que é a destruição \n"
                + "do Nexus(parte mais importante de cada base).";
        
        return objetivo;
    }
    public static String Astropas(){
        tropas = "\nTropas são soldados controlados pela IA que surgem do nexus e marcham pelas rotas até a base inimiga,\n"
                + " atacando os inimigos que encontram pelo caminho.\n"
                + " Aplicar o golpe final numa tropa concede uma recompensa em Ouro para o seu campeão.\n"
                + " Tropas preferem lutar umas contra as outras, mas atacarão seu campeão se ele estiver sozinho na rota.\n"
                + " Elas também atacarão qualquer campeão que ataque um campeão aliado delas.\n"
                + " Não as subestime tropas, principalmente no começo do jogo!";
        
        return tropas;
    }
    
}
