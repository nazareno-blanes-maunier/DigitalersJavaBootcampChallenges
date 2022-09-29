package entidades;

import interfaces.autoincrementable;

public abstract class producto implements autoincrementable {
    private Long id;
	public static Float DESCUENTO = 30f;
	private String descripcion;
	private Float precio;
	private Integer cantidad;

	public producto() {

	}

	public producto(Long id, String descripcion, Float precio, Integer cantidad) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad=" + cantidad
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	//metodo abstracto
	public abstract Float getPrecioInventario();
}
