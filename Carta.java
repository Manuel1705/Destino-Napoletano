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
        descrizioni.put(chiave(Seme.COPPE, Valore.ASSO, Verso.DRITTA), "Tradizionalmente visto come la casa. Può rappresentare la casa del consultante, o comunque un edificio, un ufficio o un luogo chiuso a lui/lei famigliare.");
        descrizioni.put(chiave(Seme.COPPE, Valore.ASSO, Verso.CAPOVOLTA), "Problemi all’interno della casa/ufficio.");

        descrizioni.put(chiave(Seme.COPPE, Valore.DUE, Verso.DRITTA), "Le bocche che parlano. Rappresenta un dialogare tra due o più persone. Simbolo di compatibilità e affinità nella coppia, lavorativa o sentimentale.");
        descrizioni.put(chiave(Seme.COPPE, Valore.DUE, Verso.CAPOVOLTA), "Problemi comunicativi, mutismo, cose non dette. Vicina a carte negative può significare anche la presenza di bugie nella relazione.");

        descrizioni.put(chiave(Seme.COPPE, Valore.TRE, Verso.DRITTA), "Il frutto generato dall’unione di due elementi. Può preannunciare l’arrivo di un figlio. Rappresenta inoltre il raccogliere i frutti del proprio operato. Diciamo, una soddisfazione.");
        descrizioni.put(chiave(Seme.COPPE, Valore.TRE, Verso.CAPOVOLTA), "La frustrazione di quando si è fatto molto ma ottenuto poco. Una situazione che non dà soddisfazioni.");

        descrizioni.put(chiave(Seme.COPPE, Valore.QUATTRO, Verso.DRITTA), "Un chiarimento. Una situazione armoniosa o degli accordi presi a tavolino. In amore, potrebbe essere un dialogo chiarificatore in amore.");
        descrizioni.put(chiave(Seme.COPPE, Valore.QUATTRO, Verso.CAPOVOLTA), "Un tentativo di chiarimento non andato in porto. Ognuno è fermo sulle proprie posizioni e non si giunge ad un accordo.");
        
        descrizioni.put(chiave(Seme.COPPE, Valore.CINQUE, Verso.DRITTA), "I legami di parentela quindi la famiglia. Può simboleggiare l’arrivo di un lieto evento all’interno della famiglia, come l’arrivo di un bambino.");
        descrizioni.put(chiave(Seme.COPPE, Valore.CINQUE, Verso.CAPOVOLTA), "Il ritorno di un qualcosa o un qualcuno. Una situazione passata che si riproporrà.");

        descrizioni.put(chiave(Seme.COPPE, Valore.SEI, Verso.DRITTA), "La carta del passato. Rappresenta tutto ciò che è avvenuto, il ricordo e le memorie. Un passato che potrebbe ritornare, a seconda delle carte circostanti.");
        descrizioni.put(chiave(Seme.COPPE, Valore.SEI, Verso.CAPOVOLTA), "Carta del futuro. Attraverso le carte circostanti si può scoprire cosa metta in serbo il futuro.");

        descrizioni.put(chiave(Seme.COPPE, Valore.SETTE, Verso.DRITTA), "Rappresenta la riuscita. Una soddisfazione. Associata ad altre carte può presagire eventi gioiosi o comunque un ritrovo di persone in una situazione di allegria e di condivisione.");
        descrizioni.put(chiave(Seme.COPPE, Valore.SETTE, Verso.CAPOVOLTA), "Il contrario di quanto detto sopra. La tristezza o una meta non raggiunta.");

        descrizioni.put(chiave(Seme.COPPE, Valore.FANTE, Verso.DRITTA), "Il consultante è molto emotivo, probabilmente innamorato, che mette tanta passione in quello che fa.");
        descrizioni.put(chiave(Seme.COPPE, Valore.FANTE, Verso.CAPOVOLTA), "Il consultante sta passando un periodo delicato a livello sentimentale.");

        descrizioni.put(chiave(Seme.COPPE, Valore.CAVALLO, Verso.DRITTA), "Una situazione in cui c’è un invito. L’arrivo di qualcuno che probabilmente già conosciamo. Per quanto riguarda l’amore, simboleggia il ritorno di una persona amata o l’avvicinamento di un corteggiatore. Nel lavoro, potrebbe simboleggiare una proposta. Essendo un cavallo simboleggia anche uno spostamento.");
        descrizioni.put(chiave(Seme.COPPE, Valore.CAVALLO, Verso.CAPOVOLTA), "Una situazione in cui c’è un invito. L’arrivo di qualcuno che probabilmente già conosciamo. Per quanto riguarda l’amore, simboleggia il ritorno di una persona amata o l’avvicinamento di un corteggiatore. Nel lavoro, potrebbe simboleggiare una proposta. Essendo un cavallo simboleggia anche uno spostamento.");

        descrizioni.put(chiave(Seme.COPPE, Valore.RE, Verso.DRITTA), "Il consultante è molto emotivo, probabilmente innamorato, che mette tanta passione in quello che fa.");
        descrizioni.put(chiave(Seme.COPPE, Valore.RE, Verso.CAPOVOLTA), "Il consultante sta passando un periodo delicato a livello sentimentale.");


        descrizioni.put(chiave(Seme.DENARI, Valore.ASSO, Verso.DRITTA), "Simboleggia tutti i documenti ufficiali. Rappresenta inoltre il matrimonio. Oltre ad essere la carta della vittoria. Una particolarità di questa carta è che annienta i significati negativi delle carte circostanti.");
        descrizioni.put(chiave(Seme.DENARI, Valore.ASSO, Verso.CAPOVOLTA), "Rappresenta una consolazione. Vuol dire che non perde i significati positivi però non cancella i significati negativi delle carte circostanti.");

        descrizioni.put(chiave(Seme.DENARI, Valore.DUE, Verso.DRITTA), "Rappresenta gli occhi quindi il vedere qualcosa o qualcuno. L’incontrarsi.");
        descrizioni.put(chiave(Seme.DENARI, Valore.DUE, Verso.CAPOVOLTA), "Un messaggio, un documento o una lettera da leggere.");

        descrizioni.put(chiave(Seme.DENARI, Valore.TRE, Verso.DRITTA), "Un Accordo, una piccola entrata di denaro, o comunque un vantaggio sul piano materiale.");
        descrizioni.put(chiave(Seme.DENARI, Valore.TRE, Verso.CAPOVOLTA), "Il vantaggio sul piano materiale non c’è e se si tratta di una piccola somma di denaro sarà in perdita.");

        descrizioni.put(chiave(Seme.DENARI, Valore.QUATTRO, Verso.DRITTA), "Solidità e stabilità materiale. In amore simboleggia il letto, cioè tra le due persone c’è una grande attrazione fisica.");
        descrizioni.put(chiave(Seme.DENARI, Valore.QUATTRO, Verso.CAPOVOLTA), "Non c’è stabilità sul piano materiale. Soldi che entrano e escono senza una continuità. Può simboleggiare anche un luogo di lavoro ostile o una storia con poche emozioni.");

        descrizioni.put(chiave(Seme.DENARI, Valore.CINQUE, Verso.DRITTA), "La carta dell’amore e del sentimento tra due persone. Sul lavoro significa passione per il proprio lavoro e autorealizzazione. Potrebbe anche simboleggiare l’arrivo di notizie, buone o cattive.");
        descrizioni.put(chiave(Seme.DENARI, Valore.CINQUE, Verso.CAPOVOLTA), "Un amore finito o sofferente. Supportata da altre carte può presagire una triangolazione amorosa, come una scappatella o una vera e propria relazione con un’altra persona.");

        descrizioni.put(chiave(Seme.DENARI, Valore.SEI, Verso.DRITTA), "Tradizionalmente rappresenta le lacrime. Le lacrime intese come una situazione positiva o negativa, lacrime di gioia o di dolore. Lacrime con un forte impatto emotivo.");
        descrizioni.put(chiave(Seme.DENARI, Valore.SEI, Verso.CAPOVOLTA), "Tradizionalmente rappresenta le lacrime. Le lacrime intese come una situazione positiva o negativa, lacrime di gioia o di dolore. Lacrime con un forte impatto emotivo.");

        descrizioni.put(chiave(Seme.DENARI, Valore.SETTE, Verso.DRITTA), "Il sette bello porta fortuna. Una carta che simboleggia una riuscita dovuta anche a molta fortuna, nella quale il consultante ha dovuto faticare poco per ottenerla. Insieme all’asso di denari, cancella e annienta le carte negative circostanti.");
        descrizioni.put(chiave(Seme.DENARI, Valore.SETTE, Verso.CAPOVOLTA), "Simboleggia una situazione rischiosa. Sfidare la sorte. Non annulla le carte negative circostanti. Non promette la riuscita.");

        descrizioni.put(chiave(Seme.DENARI, Valore.FANTE, Verso.DRITTA), "Il consultante è molto impegnato sul lato materiale della propria vita.");
        descrizioni.put(chiave(Seme.DENARI, Valore.FANTE, Verso.CAPOVOLTA), "Il consultante è preoccupato per questioni materiali relative alla sua vita o alla questione per la quale richiedono la seduta.");

        descrizioni.put(chiave(Seme.DENARI, Valore.CAVALLO, Verso.DRITTA), "Il pensiero di qualcuno. In questioni amore potrebbe simboleggiare che qualcuno ci stia pensando. Nel lavoro e nell’economia, questa carta potrebbe rappresentare una somma di denaro in movimento o una notizia in arrivo.");
        descrizioni.put(chiave(Seme.DENARI, Valore.CAVALLO, Verso.CAPOVOLTA), "Inazione, inerzia e pigrizia. Una situazione bloccata. Potrebbe significare che il denaro sia bloccato o una notizia che tarda ad arrivare.");

        descrizioni.put(chiave(Seme.DENARI, Valore.RE, Verso.DRITTA), "Il consultante è molto impegnato sul lato materiale della propria vita.");
        descrizioni.put(chiave(Seme.DENARI, Valore.RE, Verso.CAPOVOLTA), "Il consultante è preoccupato per questioni materiali relative alla sua vita o alla questione per la quale richiedono la seduta.");  


        descrizioni.put(chiave(Seme.BASTONI, Valore.ASSO, Verso.DRITTA), "La carta della maschilità. Il significato principale della carta è il piacere, il gusto e rimanda a questioni relative al sesso. Rimanda anche alla penna con cui si scrivere, quindi firme di contratti o carte importanti.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.ASSO, Verso.CAPOVOLTA), "Un dispiacere o una cosa che non avviene, oppure problemi di nature sessuale.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.DUE, Verso.DRITTA), "Tradizionalmente rappresenta le gambe quindi uno spostamento breve. Simboleggia inoltre un qualcosa che avviene in uno stretto lasso di tempo, o a breve. Quando questa carta esce tra due figure può rappresentare una lite, spesso passeggera, tra due persone che si vogliono bene.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.DUE, Verso.CAPOVOLTA), "Una sorpresa o una situazione in cui si vengono a scoprire delle cose nascoste o non dette, nella quale si inizia a vedere la situazione sotto un altro aspetto.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.TRE, Verso.DRITTA), "L’unione e il sodalizio, o comunque l’unità. Sul lavoro potrebbe essere una collaborazione come in amore simboleggia una grande unione tra due persone.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.TRE, Verso.CAPOVOLTA), "Una rottura, lavorativa o sentimentale.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.QUATTRO, Verso.DRITTA), "Tutte le cose che si fanno attorno ad un tavolo: dialogare e confrontarsi. È inoltre una carta che rende stabile tutto ciò che tocca. Quando esce vicino ad altre carte, positive o negative, simboleggia che una determinata situazione sia stabile.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.QUATTRO, Verso.CAPOVOLTA), "Tutte le cose che si fanno attorno ad un tavolo: dialogare e confrontarsi. È inoltre una carta che rende stabile tutto ciò che tocca. Quando esce vicino ad altre carte, positive o negative, simboleggia che una determinata situazione sia stabile.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.CINQUE, Verso.DRITTA), "Abbondanza e opulenza, materiale o spirituale. Una splendida carta che promette riuscita. Inoltre, potrebbe indicare che il consultante abbia parlato o parlerà con qualcuno di importante.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.CINQUE, Verso.CAPOVOLTA), "La giustizia e i procedimenti penali.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.SEI, Verso.DRITTA), "La carta dell’ambiente domestico. Può rappresentare inoltre un lavoro da dipendente che si potrebbe trovare. È una carta che moltiplica tutto quello che tocca, nel bene e nel male. Se esce in concomitanza con una storia d’amore, vuol dire che quella storia durerà nel tempo.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.SEI, Verso.CAPOVOLTA), "La carta dell’ambiente domestico. Può rappresentare inoltre un lavoro da dipendente che si potrebbe trovare. È una carta che moltiplica tutto quello che tocca, nel bene e nel male. Se esce in concomitanza con una storia d’amore, vuol dire che quella storia durerà nel tempo.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.SETTE, Verso.DRITTA), "Rappresenta ancora volta una riuscita, questa volta per accordo con altre persone. Un altro aspetto importante di questa carta riguarda le parole e i discorsi. Tutto ciò che viene sul piano verbale.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.SETTE, Verso.CAPOVOLTA), "Riuscita mancata dopo tanto faticare. Chiacchiere, malignità e calunnie. Lavora sul piano verbale però in senso negativo.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.FANTE, Verso.DRITTA), "Il consultante è una persona energica, molto attiva e determinata. Buona salute. Una persona che ha il controllo della situazione.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.FANTE, Verso.CAPOVOLTA), "Il consultante stanno passando un periodo di stanchezza e inattività, oppure con qualche problema di salute.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.CAVALLO, Verso.DRITTA), "Rappresenta un viaggio, una partenza, uno spostamento finisco. Uno spostamento generalmente lungo a seconda delle carte circostanti.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.CAVALLO, Verso.CAPOVOLTA), "Una rottura, lavorativa o sentimentale.");

        descrizioni.put(chiave(Seme.BASTONI, Valore.RE, Verso.DRITTA), "Il consultante è una persona energica, molto attiva e determinata. Buona salute. Una persona che ha il controllo della situazione.");
        descrizioni.put(chiave(Seme.BASTONI, Valore.RE, Verso.CAPOVOLTA), "Il consultante stanno passando un periodo di stanchezza e inattività, oppure con qualche problema di salute.");


        descrizioni.put(chiave(Seme.SPADE, Valore.ASSO, Verso.DRITTA), "Un problema, un guaio o un ostacolo.");
        descrizioni.put(chiave(Seme.SPADE, Valore.ASSO, Verso.CAPOVOLTA), "Un ostacolo o il peggio è passato.");

        descrizioni.put(chiave(Seme.SPADE, Valore.DUE, Verso.DRITTA), "La carta dell’inimicizia e della discordia. Simboleggia anche la rivalità. Potrebbe simboleggiare una lite aperta.");
        descrizioni.put(chiave(Seme.SPADE, Valore.DUE, Verso.CAPOVOLTA), "Attesa o una tregua. Una lite cessata, un momento di pace.");

        descrizioni.put(chiave(Seme.SPADE, Valore.TRE, Verso.DRITTA), "La zizzania, cioè un terzo elemento che crea scompiglio tra due elementi. Può simboleggiare la presenza di un tradimento. La carta della malignità, delle chiacchiere, delle calunnie e degli intrighi.");
        descrizioni.put(chiave(Seme.SPADE, Valore.TRE, Verso.CAPOVOLTA), "La zizzania, cioè un terzo elemento che crea scompiglio tra due elementi. Può simboleggiare la presenza di un tradimento. La carta della malignità, delle chiacchiere, delle calunnie e degli intrighi.");

        descrizioni.put(chiave(Seme.SPADE, Valore.QUATTRO, Verso.DRITTA), "Il letto di dolore. Una malattia o un blocco. Indica una situazione momentaneamente bloccata. Un periodo di convalescenza o isolamento. Le carte circostanti diranno di cosa si tratta.");
        descrizioni.put(chiave(Seme.SPADE, Valore.QUATTRO, Verso.CAPOVOLTA), "Il letto di dolore. Una malattia o un blocco. Indica una situazione momentaneamente bloccata. Un periodo di convalescenza o isolamento. Le carte circostanti diranno di cosa si tratta.");

        descrizioni.put(chiave(Seme.SPADE, Valore.CINQUE, Verso.DRITTA), "Potrebbe simboleggiare un cancello, quindi un contesto in cui è difficile accedere per il momento. Il sentirsi imprigionati. Può simboleggiare un periodo in cui si tende particolarmente al voler star soli. Un periodo di isolamento voluto o imposto.");
        descrizioni.put(chiave(Seme.SPADE, Valore.CINQUE, Verso.CAPOVOLTA), "Gelosia, pentimento e rimorso.");

        descrizioni.put(chiave(Seme.SPADE, Valore.SEI, Verso.DRITTA), "Indica I nemici, la falsità e le cose nascoste. Delle situazioni insidiose perché non si conoscono bene. Il significato più leggero di questa carta simboleggia una situazione o una persona che si conosce poco.");
        descrizioni.put(chiave(Seme.SPADE, Valore.SEI, Verso.CAPOVOLTA), "Indica I nemici, la falsità e le cose nascoste. Delle situazioni insidiose perché non si conoscono bene. Il significato più leggero di questa carta simboleggia una situazione o una persona che si conosce poco.");

        descrizioni.put(chiave(Seme.SPADE, Valore.SETTE, Verso.DRITTA), "Rappresenta un fallimento. Quando questa carta risponde ad una domanda significa che quella cosa non avverrà.");
        descrizioni.put(chiave(Seme.SPADE, Valore.SETTE, Verso.CAPOVOLTA), "Un problema esiste ma sarà risolvibile in futuro.");
        descrizioni.put(chiave(Seme.SPADE, Valore.FANTE, Verso.DRITTA), "Possono rappresentare un consultante fermo sulle proprie posizioni, rigido, che non fa un passo in dietro. Un consultante che si rifiuta di analizzare la situazione e magari imparare dai propri errori. Potrebbe rappresentare anche un dolore in sospeso.");
        descrizioni.put(chiave(Seme.SPADE, Valore.FANTE, Verso.CAPOVOLTA), "Il consultante è molto arrabbiato e agguerrito. La ragione di questo ce la diranno le carte circostanti.");

        descrizioni.put(chiave(Seme.SPADE, Valore.CAVALLO, Verso.DRITTA), "Simboleggia sempre l’arrivo di qualcuno da fuori. In una stesa sull’amore, potrebbe rappresentate una persona che viene da fuori, non dalle tue zone. È una carta che porta anche notizie negative parlando di soldi.");
        descrizioni.put(chiave(Seme.SPADE, Valore.CAVALLO, Verso.CAPOVOLTA), "Blocco doloroso di una situazione che dovrebbe scorrere.");

        descrizioni.put(chiave(Seme.SPADE, Valore.RE, Verso.DRITTA), "Possono rappresentare un consultante fermo sulle proprie posizioni, rigido, che non fa un passo in dietro. Un consultante che si rifiuta di analizzare la situazione e magari imparare dai propri errori. Potrebbe rappresentare anche un dolore in sospeso.");
        descrizioni.put(chiave(Seme.SPADE, Valore.RE, Verso.CAPOVOLTA), "Il consultante è molto arrabbiato e agguerrito. La ragione di questo ce la diranno le carte circostanti.");        
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
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String color = RESET;
        switch (seme) {
            case COPPE:
                color = RED;
                break;
            case DENARI:
                color = YELLOW;
                break;
            case SPADE:
                color = BLUE;
                break;
            case BASTONI:
                color = GREEN;
                break;
        }
        return color + valore + " di " + seme + " (" + verso + ")" + ":\n" + RESET + descrizione;
    }
}
