public class Vida {
    private int quantidadeDeVida;
    private int vidaMáxima;
    


    public Vida(int quantidadeDeVida, int vidaMáxima) {
        this.quantidadeDeVida = quantidadeDeVida;
        this.vidaMáxima = vidaMáxima;
    }


    public void receberDanoFlat(int Dano){
        quantidadeDeVida -= Dano;

    }
    public void ganharVidaFlat(int quantidade){
        if( quantidade + quantidadeDeVida > vidaMáxima){
            quantidadeDeVida = vidaMáxima;
        }else{
        quantidadeDeVida += quantidade;
        }
    }
    public int getQuantidadeDeVida() {
        return quantidadeDeVida;
    }
    public void setQuantidadeDeVida(int quantidadeDeVida) {
        this.quantidadeDeVida = quantidadeDeVida;
    }
    public int getVidaMáxima() {
        return vidaMáxima;
    }
    public void setVidaMáxima(int vidaMáxima) {
        this.vidaMáxima = vidaMáxima;
    }


    @Override
    public String toString() {
        return "Vida [quantidadeDeVida=" + quantidadeDeVida + ", vidaMáxima=" + vidaMáxima + "]";
    }
    

}
