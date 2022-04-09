public class CarroFacade {

    public static boolean VerificarCarroErroMontagem(Carro carro){
        if (Lataria.getInstance().verificarCarroComErroMontagem(carro)){
            return false;
        }
        if (Motor.getInstance().verificarCarroComErroMontagem(carro)){
            return false;
        }
        if (Pneu.getInstance().verificarCarroComErroMontagem(carro)){
            return false;
        }
        return true;
    }

}
