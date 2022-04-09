import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Carro> carrosComErroMontagem = new ArrayList<Carro>();

    public void addCarroErroMontagem(Carro carro){
        this.carrosComErroMontagem.add(carro);
    }

    public boolean verificarCarroComErroMontagem(Carro carro){
        return this.carrosComErroMontagem.contains(carro);
    }

}
