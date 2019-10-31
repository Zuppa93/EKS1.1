public class Familienpaket extends Geschenkpaket {

    public Gutschein erzeugeGutschein(){
        gutschein=new DVD_Gutschein(25);
        return gutschein;
    }
    public Werbegeschenk erzeugeWerbegeschenk(){
        werbegeschenk=new Fussball();
        return werbegeschenk;
    }
}
