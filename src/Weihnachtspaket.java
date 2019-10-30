public class Weihnachtspaket implements Geschenkpaket {

    private Werbegeschenk geschenk;
    private Gutschein gutschein;

    public Gutschein erzeugeGutschein() {
        Gutschein gutschein = new CD(20);
        return gutschein;
    }

    public Werbegeschenk erzeugeWerbegeschenk() {
        Werbegeschenk werbegeschenk = new Weihnachtsmann();
        return werbegeschenk;
    }
}
