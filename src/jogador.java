public class jogador extends Entidade {

    private Vida vida;
    private Ataque ataque;

    public jogador(String nomeID) {
        this.vida = new Vida(10, 10);
        this.ataque = new Ataque(20);
        this.setNomeID(nomeID);
    }
    public void atacarFlat(Vida vidaAlvo){
        vidaAlvo.receberDanoFlat(ataque.getForçaAtaque());
    }
    public Vida getVida() {
        return vida;
    }
    public void setVida(Vida vida) {
        this.vida = vida;
    }
    public Ataque getAtaque() {
        return ataque;
    }
    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " // nome: " + getNomeID() + " // " + vida +" // " + ataque;
    }
    


}
