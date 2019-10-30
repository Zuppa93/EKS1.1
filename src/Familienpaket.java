public class Familienpaket implements Geschenkpaket {

    public Gutschein erzeugeGutschein(){
        return new DVD(25);
    }
    public Werbegeschenk erzeugeWerbegeschenk(){
        return new Fussball();
    }
}
