import java.util.HashMap;
import java.util.Map;

public class Carta {
    enum Seme {
        COPPE, DENARI, SPADE, BASTONI
    } 
    enum Valore {
        ASSO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, FANTE, CAVALLO, RE
    }
    enum Verso {
        DRITTA, CAPOVOLTA
    }
    private Seme seme;
    private Valore valore;
    private Verso verso;
    private String descrizione;

    private static final Map<String, String> descrizioni = new HashMap<>();

    static {
        descrizioni.put(chiave(Seme.COPPE, Valore.ASSO, Verso.DRITTA), "Descrizione per l'asso di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.ASSO, Verso.CAPOVOLTA), "Descrizione per l'asso di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.DUE, Verso.DRITTA), "Descrizione per il due di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.DUE, Verso.CAPOVOLTA), "Descrizione per il due di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.TRE, Verso.DRITTA), "Descrizione per il tre di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.TRE, Verso.CAPOVOLTA), "Descrizione per il tre di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.QUATTRO, Verso.DRITTA), "Descrizione per il quattro di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.QUATTRO, Verso.CAPOVOLTA), "Descrizione per il quattro di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.CINQUE, Verso.DRITTA), "Descrizione per il cinque di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.CINQUE, Verso.CAPOVOLTA), "Descrizione per il cinque di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.SEI, Verso.DRITTA), "Descrizione per il sei di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.SEI, Verso.CAPOVOLTA), "Descrizione per il sei di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.SETTE, Verso.DRITTA), "Descrizione per il sette di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.SETTE, Verso.CAPOVOLTA), "Descrizione per il sette di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.FANTE, Verso.DRITTA), "Descrizione per il fante di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.FANTE, Verso.CAPOVOLTA), "Descrizione per il fante di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.CAVALLO, Verso.DRITTA), "Descrizione per il cavallo di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.CAVALLO, Verso.CAPOVOLTA), "Descrizione per il cavallo di coppe capovolto");
        descrizioni.put(chiave(Seme.COPPE, Valore.RE, Verso.DRITTA), "Descrizione per il re di coppe");
        descrizioni.put(chiave(Seme.COPPE, Valore.RE, Verso.CAPOVOLTA), "Descrizione per il re di coppe capovolto");

        descrizioni.put(chiave(Seme.DENARI, Valore.ASSO, Verso.DRITTA), "Descrizione per l'asso di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.ASSO, Verso.CAPOVOLTA), "Descrizione per l'asso di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.DUE, Verso.DRITTA), "Descrizione per il due di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.DUE, Verso.CAPOVOLTA), "Descrizione per il due di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.TRE, Verso.DRITTA), "Descrizione per il tre di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.TRE, Verso.CAPOVOLTA), "Descrizione per il tre di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.QUATTRO, Verso.DRITTA), "Descrizione per il quattro di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.QUATTRO, Verso.CAPOVOLTA), "Descrizione per il quattro di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.CINQUE, Verso.DRITTA), "Descrizione per il cinque di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.CINQUE, Verso.CAPOVOLTA), "Descrizione per il cinque di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.SEI, Verso.DRITTA), "Descrizione per il sei di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.SEI, Verso.CAPOVOLTA), "Descrizione per il sei di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.SETTE, Verso.DRITTA), "Descrizione per il sette di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.SETTE, Verso.CAPOVOLTA), "Descrizione per il sette di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.FANTE, Verso.DRITTA), "Descrizione per il fante di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.FANTE, Verso.CAPOVOLTA), "Descrizione per il fante di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.CAVALLO, Verso.DRITTA), "Descrizione per il cavallo di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.CAVALLO, Verso.CAPOVOLTA), "Descrizione per il cavallo di denari capovolto");
        descrizioni.put(chiave(Seme.DENARI, Valore.RE, Verso.DRITTA), "Descrizione per il re di denari");
        descrizioni.put(chiave(Seme.DENARI, Valore.RE, Verso.CAPOVOLTA), "Descrizione per il re di denari capovolto");  

        descrizioni.put(chiave(Seme.SPADE, Valore.ASSO, Verso.DRITTA), "Descrizione per l'asso di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.ASSO, Verso.CAPOVOLTA), "Descrizione per l'asso di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.DUE, Verso.DRITTA), "Descrizione per il due di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.DUE, Verso.CAPOVOLTA), "Descrizione per il due di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.TRE, Verso.DRITTA), "Descrizione per il tre di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.TRE, Verso.CAPOVOLTA), "Descrizione per il tre di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.QUATTRO, Verso.DRITTA), "Descrizione per il quattro di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.QUATTRO, Verso.CAPOVOLTA), "Descrizione per il quattro di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.CINQUE, Verso.DRITTA), "Descrizione per il cinque di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.CINQUE, Verso.CAPOVOLTA), "Descrizione per il cinque di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.SEI, Verso.DRITTA), "Descrizione per il sei di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.SEI, Verso.CAPOVOLTA), "Descrizione per il sei di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.SETTE, Verso.DRITTA), "Descrizione per il sette di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.SETTE, Verso.CAPOVOLTA), "Descrizione per il sette di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.FANTE, Verso.DRITTA), "Descrizione per il fante di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.FANTE, Verso.CAPOVOLTA), "Descrizione per il fante di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.CAVALLO, Verso.DRITTA), "Descrizione per il cavallo di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.CAVALLO, Verso.CAPOVOLTA), "Descrizione per il cavallo di spade capovolto");
        descrizioni.put(chiave(Seme.SPADE, Valore.RE, Verso.DRITTA), "Descrizione per il re di spade");
        descrizioni.put(chiave(Seme.SPADE, Valore.RE, Verso.CAPOVOLTA), "Descrizione per il re di spade capovolto");

        descrizioni.put(chiave(Seme.BASTONI, Valore.ASSO, Verso.DRITTA), "Descrizione per l'asso di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.ASSO, Verso.CAPOVOLTA), "Descrizione per l'asso di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.DUE, Verso.DRITTA), "Descrizione per il due di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.DUE, Verso.CAPOVOLTA), "Descrizione per il due di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.TRE, Verso.DRITTA), "Descrizione per il tre di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.TRE, Verso.CAPOVOLTA), "Descrizione per il tre di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.QUATTRO, Verso.DRITTA), "Descrizione per il quattro di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.QUATTRO, Verso.CAPOVOLTA), "Descrizione per il quattro di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.CINQUE, Verso.DRITTA), "Descrizione per il cinque di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.CINQUE, Verso.CAPOVOLTA), "Descrizione per il cinque di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.SEI, Verso.DRITTA), "Descrizione per il sei di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.SEI, Verso.CAPOVOLTA), "Descrizione per il sei di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.SETTE, Verso.DRITTA), "Descrizione per il sette di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.SETTE, Verso.CAPOVOLTA), "Descrizione per il sette di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.FANTE, Verso.DRITTA), "Descrizione per il fante di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.FANTE, Verso.CAPOVOLTA), "Descrizione per il fante di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.CAVALLO, Verso.DRITTA), "Descrizione per il cavallo di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.CAVALLO, Verso.CAPOVOLTA), "Descrizione per il cavallo di bastoni capovolto");
        descrizioni.put(chiave(Seme.BASTONI, Valore.RE, Verso.DRITTA), "Descrizione per il re di bastoni");
        descrizioni.put(chiave(Seme.BASTONI, Valore.RE, Verso.CAPOVOLTA), "Descrizione per il re di bastoni capovolto");
    }

    private static String chiave(Seme seme, Valore valore, Verso verso) {
        return seme + "-" + valore + "-" + verso;
    }

    public Carta(Seme seme, Valore valore, Verso verso) {
        this.seme = seme;
        this.valore = valore;
        this.verso = verso;
        setDescrizione();  
    }
    public void setDescrizione() {
        String chiave = chiave(seme, valore, verso);
        this.descrizione = descrizioni.getOrDefault(chiave, "Descrizione non disponibile");
        
    }
    public Seme getSeme() {
        return seme;
    }
    public Valore getValore() {
        return valore;
    }
    public Verso getVerso() {
        return verso;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public String toString() {
        return valore + " di " + seme + " (" + verso + ")" + ": " + descrizione;
    }
}
