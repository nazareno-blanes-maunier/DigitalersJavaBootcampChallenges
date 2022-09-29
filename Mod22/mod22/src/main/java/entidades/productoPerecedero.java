package entidades;

public class productoPerecedero extends producto {
    private int diasPorVencer;

	public productoPerecedero() {

	}

	public productoPerecedero(Long id, String descripcion, Float precio, Integer cantidad, int diasPorVencer) {
		super(id, descripcion, precio, cantidad);
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
			return getPrecio() * getCantidad();
		}

		return ((getPrecio() - (getPrecio() * (DESCUENTO / 100))) * getCantidad());
	}

}
