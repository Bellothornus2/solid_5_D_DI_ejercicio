package org.formacion.di.negocio;

import org.formacion.di.bbdd.InventarioBBDD;

public class ControladorEstoc{
	private ControladorEstoc(){}
	/*
	 * Nuestros sesudos estudios han descubierto que los clientes compran mas
	 * productos cuando el nombre de este producto es mas largo
	 * Por eso, el estoc no puede ser inferior a 100 * la longitud del nombre del producto
	 * p.e: necesitamos al menos 400 mesas (mesa : 4 letras) y
	 *    al menos 700 lamparas (lampara: 7 letras)
	 */
	public static boolean necesitaReponer(String tienda, String producto) {
		int cantidadActual = InventarioBBDD.numeroProductos(tienda, producto);
		return  cantidadActual < producto.length() * 100;
	}

}
