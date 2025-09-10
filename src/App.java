public class App {
    public static void main(String[] args) throws Exception {
        jogador Chara = new jogador();
        slime Rimuru = new slime();

        System.out.println(Rimuru.getVida());

        Chara.atacarFlat(Rimuru.getVida());

        System.out.println(Rimuru.getVida());

    }
}
