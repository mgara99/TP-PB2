
import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.pb2.disco.Disco;


public class DiscoTest {


	@Test
	public void testPoderCambiarRadioInterior(){
		//1. Preparacion
			Disco miDisco = new Disco(3,5);
			Integer valorEsperado=2;
	    //2. Ejecucion
			miDisco.cambiarElRadioInterior(2);
			Integer valorObtenido= (int) miDisco.mostrarRadioInterior();
			
		//3. Contrastacion
			Assert.assertEquals(valorEsperado,valorObtenido);		
	}
	
	@Test
	public void testPoderCambiarRadioExterior(){
		//1. Preparacion
			Disco miDisco = new Disco(3,5);
			Integer valorEsperado=2;
	    //2. Ejecucion
			miDisco.cambiarElRadioExterior(2);
			Integer valorObtenido= (int) miDisco.mostrarRadioExterior();
			
		//3. Contrastacion
			Assert.assertEquals(valorEsperado,valorObtenido);		
	}

}
