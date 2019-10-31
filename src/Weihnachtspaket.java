public class Weihnachtspaket extends Geschenkpaket {

    public Gutschein erzeugeGutschein() {
        gutschein = new CD_Gutschein(20);
        return gutschein;
    }

    public Werbegeschenk erzeugeWerbegeschenk() {
        werbegeschenk = new Weihnachtsmann();
        return werbegeschenk;
    }
}
