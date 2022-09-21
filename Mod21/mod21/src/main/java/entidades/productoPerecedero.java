package entidades;

public class productoPerecedero extends Producto {
    private int diasPorVencer;

	public productoPerecedero() {

	}

	public productoPerecedero(String descripcion, Float precio, Integer cantidad, int diasPorVencer) {
		super(descripcion, precio, cantidad);
		this.diasPorVencer = diasPorVencer;
	}

	@Override
	public String toString() {
		return "ProductoPerecedero [toString()=" + super.toString() + ", diasPorVencer=" + diasPorVencer + "]";
	}

	public int getDiasPorVencer() {
		return diasPorVencer;
	}

	public void setDiasPorVencer(int diasPorVencer) {
		this.diasPorVencer = diasPorVencer;
	}

	public Float getPrecioInventario() {

		if (diasPorVencer > 10) {
			return super.getPrecioInventario();
		}

		return ((getPrecio() - (getPrecio() * (DESCUENTO / 100))) * getCantidad());
	}
}
