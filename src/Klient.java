public class Klient {
    public static void main(String[] args) {
        Geschenkpaket weihnachten   = new Weihnachtspaket();
        Gutschein     meinGutschein = weihnachten.erzeugeGutschein();
        Werbegeschenk meinGeschenk  = weihnachten.erzeugeWerbegeschenk();
        System.out.println("Weihnachtspaket: "+ meinGutschein.getWert() + " " + meinGeschenk.getArt());

        Geschenkpaket ostern = new Osterpaket();
        Gutschein meinGutschein2 = ostern.erzeugeGutschein();
        Werbegeschenk meinGeschenk2 = ostern.erzeugeWerbegeschenk();
        System.out.println("Osterpaket: "+ meinGutschein2.getWert() + " " + meinGeschenk2.getArt());

        Geschenkpaket familie = new Familienpaket();
        Gutschein meinGutschein3 = familie.erzeugeGutschein();
        Werbegeschenk meinGeschenk3 = familie.erzeugeWerbegeschenk();
        System.out.println("Familienpaket: "+ meinGutschein3.getWert() +" " + meinGeschenk3.getArt());
    }
}