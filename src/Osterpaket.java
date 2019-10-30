public class Osterpaket implements Geschenkpaket {

    public Gutschein erzeugeGutschein(){
        return new CD(15);
    }
    public Werbegeschenk erzeugeWerbegeschenk(){
        return new Osterhase();
    }
}
