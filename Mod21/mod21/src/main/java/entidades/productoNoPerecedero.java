package entidades;

public class productoNoPerecedero extends Producto {
    
    public productoNoPerecedero() {
		super();
	}

	public productoNoPerecedero(String descripcion, Float precio, Integer cantidad) {
		super(descripcion, precio, cantidad);
	}

	@Override
	public String toString() {
		return "ProductoNoPerecedero [toString()=" + super.toString() + "]";
	}
}
