package ufv.dis.final2020.AMGRrepaso;

public class Producto {
	
	private String nombre;
	private String categoria;
	private int precio;
	private String EAN13;
	
	
	
	public Producto(String nombre, String categoria, int precio, String eAN13) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		EAN13 = eAN13;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getEAN13() {
		return EAN13;
	}
	public void setEAN13(String eAN13) {
		EAN13 = eAN13;
	}
	
	

}
