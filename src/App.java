import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        jogador Chara = new jogador("Chara");
        slime Rimuru = new slime("Rimuru");

        System.out.println(Rimuru.getVida());

        Chara.atacarFlat(Rimuru.getVida());

        System.out.println(Rimuru.getVida());


        ArrayList<Entidade> listaDeEntidades;
        listaDeEntidades = new ArrayList<Entidade>();
        
        listaDeEntidades.add(Rimuru);
        listaDeEntidades.add(Chara);

        for (Entidade entidade : listaDeEntidades) {
            System.out.println(entidade);
            
        }

    }
}
