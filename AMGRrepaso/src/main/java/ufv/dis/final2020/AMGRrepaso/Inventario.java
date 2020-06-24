package ufv.dis.final2020.AMGRrepaso;

import java.util.ArrayList;

public class Inventario {
	
	
	private ArrayList<Producto> productos;

	public Inventario() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void addProducto(Producto p){
		this.productos.add(p);
	}
	
	public void removeProducto(Producto p) {
		this.productos.remove(p);
	}

	public int inventariSize() {
		
		return this.productos.size();
	}
	
	
	
	

}
