package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class CalculadorDeFactoresPrimosTest {

	CalculadorDeFactoresPrimos calculadorDeFactoresPrimos = new CalculadorDeFactoresPrimos();

	@Test
	public void factoresPrimosConNumero132() throws ExcepcionIngresoInvalido {
		
	    String numeroRecibido = "132";

        String factorizacionDe132 = " 2 2 3 11";
        calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido);

        Assert.assertEquals(factorizacionDe132,calculadorDeFactoresPrimos.getResultadoDeFactoresPrimos());
    }
	
	@Test
	public void factoresPrimosConNumero360() throws ExcepcionIngresoInvalido {

        String numeroRecibido = "360";
        String factorizacionDe360 = " 2 2 2 3 3 5";
        calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido);

        Assert.assertEquals(factorizacionDe360, calculadorDeFactoresPrimos.getResultadoDeFactoresPrimos());
	}
	
	@Test
	public void factoresPrimosConNumero18() throws ExcepcionIngresoInvalido {

        String numeroRecibido = "18";
        String factorizacionDe18 = " 2 3 3";

        calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido);

        Assert.assertEquals(factorizacionDe18, calculadorDeFactoresPrimos.getResultadoDeFactoresPrimos());
 	}
	
	@Test
	public void factoresPrimosConNumero1EsperaExcepcion() throws ExcepcionNumeroInvalido {

		String numeroRecibido = "1";

        try {
            calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido);
        }catch(ExcepcionNumeroInvalido e){
            throw e;
        }
	}

    @Test
    public void factoresPrimosConNumero0EsperaExcepcion () throws ExcepcionNumeroInvalido {

        String numeroRecibido = "0";
        try {
            calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido);
        }catch(ExcepcionNumeroInvalido e){
            throw e;
        }
    }


	@Test
	public void factoresPrimosConNumeroNegativoEsperaExcepcion() throws ExcepcionNumeroInvalido {
		
        String numeroRecibido = "-25";

        try {
            calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido);
        }catch(ExcepcionNumeroInvalido e){
            throw e;
        }
	}

    @Test
    public void factoresPrimosEsperaOrdenAscendente(){
        String numeroRecibido = "18";
        String factorizacionDe18 = " 2 3 3";

        calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido);

        Assert.assertEquals(factorizacionDe18, calculadorDeFactoresPrimos.getFactoresPrimos("asc"));
    }

    @Test
    public void factoresPrimosEsperaOrdenDescendente(){
        String numeroRecibido = "18";
        String factorizacionDe18 = " 3 3 2";

        calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido);

        Assert.assertEquals(factorizacionDe18, calculadorDeFactoresPrimos.getFactoresPrimos("des"));
    }


}