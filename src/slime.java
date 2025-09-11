public class slime extends Entidade {
    private Vida vida;
    private Ataque ataque;

    public slime(String nomeID) {
        this.vida = new Vida(100, 100);
        this.ataque = new Ataque(1);
        this.setNomeID(nomeID);

    }
    public void atacar(Vida vidaAlvo){
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
