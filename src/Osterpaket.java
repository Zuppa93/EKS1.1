public class Osterpaket implements Geschenkpaket {

    public Gutschein erzeugeGutschein(){
        return new CD_Gutschein(15);
    }
    public Werbegeschenk erzeugeWerbegeschenk(){
        return new Osterhase();
    }
}
