package entidades;
import interfaces.autoincrementable;

public class cliente implements autoincrementable {
    private Long id;
	private String nombre;
	private String apellido;
	private documento documento;

    public cliente() {

	}

    public cliente(Long id, String nombre, String apellido, documento documento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public Long getId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setId(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
