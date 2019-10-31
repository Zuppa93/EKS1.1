public class Familienpaket implements Geschenkpaket {

    public Gutschein erzeugeGutschein(){
        return new DVD_Gutschein(25);
    }
    public Werbegeschenk erzeugeWerbegeschenk(){
        return new Fussball();
    }
}
