public class Weihnachtspaket implements Geschenkpaket {

    public Gutschein erzeugeGutschein() {
        Gutschein gutschein = new CD_Gutschein(20);
        return gutschein;
    }

    public Werbegeschenk erzeugeWerbegeschenk() {
        Werbegeschenk werbegeschenk = new Weihnachtsmann();
        return werbegeschenk;
    }
}
