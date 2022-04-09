public class Carro {

    public boolean montar(){
        return CarroFacade.VerificarCarroErroMontagem(this);
    }

}
