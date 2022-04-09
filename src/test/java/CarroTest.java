import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarroTest {

    @Test
    public void deveRetornarErroMontagemLataria(){
        Carro carro = new Carro();
        Lataria.getInstance().addCarroErroMontagem(carro);

        assertEquals(false, carro.montar());

    }

    @Test
    public void deveRetornarErroMontagemMotor(){
        Carro carro = new Carro();
        Motor.getInstance().addCarroErroMontagem(carro);

        assertEquals(false, carro.montar());

    }

    @Test
    public void deveRetornarErroMontagemPneu(){
        Carro carro = new Carro();
        Pneu.getInstance().addCarroErroMontagem(carro);

        assertEquals(false, carro.montar());

    }

    @Test
    public void deveRetornarCarroSemErro(){
        Carro carro = new Carro();

        assertEquals(true, carro.montar());

    }

}
