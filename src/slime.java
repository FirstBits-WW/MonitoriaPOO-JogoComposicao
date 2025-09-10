public class slime {
    private Vida vida;
    private Ataque ataque;

    public slime() {
        this.vida = new Vida(100, 100);
        this.ataque = new Ataque(1);

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
    


}
