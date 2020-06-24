package ufv.dis.final2020.AMGRrepaso;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	
	
	@Test
	public void testInstance() {
		Producto p = new Producto("manzana", "fruta", 3, "7011548325251");
		assertEquals("manzana", p.getNombre());
	}
	
	@Test
	public void testadd() {
		Producto p = new Producto("manzana", "fruta", 3, "7011548325251");
		
		Inventario i = new Inventario();
		i.addProducto(p);
		
		assertEquals(1,i.inventariSize());
		
	}
	
	@Test
	public void testRemove() {
		Producto p = new Producto("manzana", "fruta", 3, "7011548325251");
		
		Inventario i = new Inventario();
		i.addProducto(p);
		
		i.removeProducto(p);
		
		assertEquals(0, i.inventariSize());
				
	}

}
