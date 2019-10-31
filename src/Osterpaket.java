public class Osterpaket extends Geschenkpaket {

    public Gutschein erzeugeGutschein(){
        gutschein=new CD_Gutschein(15);
        return gutschein;
    }
    public Werbegeschenk erzeugeWerbegeschenk(){
        werbegeschenk=new Osterhase();
        return werbegeschenk;
    }
}
