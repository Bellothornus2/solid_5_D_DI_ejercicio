package org.formacion.di.test;

import org.formacion.di.negocio.ControladorEstoc;
import org.junit.Assert;
import org.junit.Test;

public class TestControladorEstoc {

	@Test
	public void testControlEstoc() {
		//no entiendo porque no se puede cambiar los tests
		//cuando se hacen objetos para una clase que es estática.
		Assert.assertFalse(ControladorEstoc.necesitaReponer("tienda norte", "mesa"));
		Assert.assertTrue(ControladorEstoc.necesitaReponer("tienda norte", "lampara"));

	}

}
