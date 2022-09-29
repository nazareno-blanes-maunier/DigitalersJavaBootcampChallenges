package entidades;

public final class documento {
    
    private String tipoDocumento;
    private String numeroDocumento;
    public documento(String tipoDocumento, String numeroDocumento) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    @Override
    public String toString() {
        return "documento [numeroDocumento=" + numeroDocumento + ", tipoDocumento=" + tipoDocumento + "]";
    }
    
}
