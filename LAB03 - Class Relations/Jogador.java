class Jogador {
    private String nome;
    private int numeroCamisa;

    public Jogador(String nome, int numeroCamisa){
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public String toString(){
        return "Jogador: " + nome + "(Camisa #" + numeroCamisa + ")";
    }
}

class Equipe {
    private String nome;
    private Jogador[] jogadores;
    private int numJogadores;

    public Equipe(String nome, int tamanhoMaximo){
        this.nome = nome;
        this.jogadores = new Jogador[tamanhoMaximo];
        this.numJogadores = 0;
    }

    public void adicionarJogador(Jogador jogador){
        if(numJogadores<jogadores.length){
            jogadores[numJogadores] = jogador;
            numJogadores++;
        }
        else{
            System.out.println("Equipe completa");
        }
    }

    public String toString(){
        StringBuilder equipeInfo = new StringBuilder();
        equipeInfo.append("Equipe: ").append(nome).append("\n");
        equipeInfo.append("Jogadores:\n");
        for(int i = 0; i<numJogadores; i++){
            equipeInfo.append("-").append(jogadores[i]).append("\n");
        }
        return equipeInfo.toString();
    }
}

class Torneio{
    private String nome;
    private Equipe[] equipes;
    private int numEquipes;

    public Torneio(String nome, int tamanhoMaximo){
        this.nome = nome;
        this.equipes = new Equipe[tamanhoMaximo];
        this.numEquipes = 0;
    }

    public void adicionarEquipe(Equipe equipe){
        if(numEquipes<equipes.length){
            equipes[numEquipes] = equipe;
            numEquipes++;
        }
        else{
            System.out.println("Torneio atingiu numero maximo de equipes");
        }
    }

    public void mostrarEquipes(){
        System.out.println("Torneio:" + nome);
        System.out.println("Equipes participantes: ");
        for(int i = 0; i<numEquipes; i++){
            System.out.println(equipes[i]);
        }
    }
}






