public class Motor extends Setor{

    private static Motor motor = new Motor();

    private Motor(){};

    public static Motor getInstance(){
        return motor;
    }

}

