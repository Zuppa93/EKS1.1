public abstract class Geschenkpaket {

    protected Werbegeschenk werbegeschenk;
    protected Gutschein gutschein;

    public abstract Gutschein erzeugeGutschein();
    public abstract Werbegeschenk erzeugeWerbegeschenk();
}
