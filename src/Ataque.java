public class Ataque {
    private int forçaAtaque;
    

    public Ataque(int forçaAtaque) {
        this.forçaAtaque = forçaAtaque;
    }

    public int getForçaAtaque() {
        return forçaAtaque;
    }

    public void setForçaAtaque(int forçaAtaque) {
        this.forçaAtaque = forçaAtaque;
    }

    @Override
    public String toString() {
        return "Ataque [forçaAtaque=" + forçaAtaque + "]";
    }
    

}
