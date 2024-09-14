import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MazzoCarte {

    private List<Carta> mazzo = new ArrayList<Carta>();

    public MazzoCarte() {
        for (Carta.Seme seme : Carta.Seme.values()) {
            for (Carta.Valore valore : Carta.Valore.values()) {
                for(Carta.Verso verso : Carta.Verso.values()){
                    mazzo.add(new Carta(seme, valore, verso));
                }
            }
        }
    }

    public void mescola() {
        Collections.shuffle(mazzo, new Random());
    }

    public Carta pesca() {
        return mazzo.remove(0);
    }

    public static void main(String[] args) {
        MazzoCarte mazzo = new MazzoCarte();
        mazzo.mescola();
        for (int i = 1; i <= 5; i++) {
            Carta carta = mazzo.pesca();
            System.out.println("Carta " + i);
            System.out.println(carta);
            System.out.println();
        }
    }
}