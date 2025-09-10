public class jogador {

    private Vida vida;
    private Ataque ataque;

    public jogador() {
        this.vida = new Vida(10, 10);
        this.ataque = new Ataque(20);
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


}
