public class Lataria extends Setor{

    private static Lataria lataria = new Lataria();

    private Lataria(){};

    public static Lataria getInstance(){
        return lataria;
    }

}
