package entidades;

public class productoNoPerecedero extends producto {
    public productoNoPerecedero() {
		super();

	}

	public productoNoPerecedero(Long id, String descripcion, Float precio, Integer cantidad) {
		super(id, descripcion, precio, cantidad);

	}

	public Float getPrecioInventario() {
		return getPrecio() * getCantidad();
	}
}

