public class Pneu extends Setor{

    private static Pneu pneu = new Pneu();

    private Pneu(){};

    public static Pneu getInstance(){
        return pneu;
    }

}
