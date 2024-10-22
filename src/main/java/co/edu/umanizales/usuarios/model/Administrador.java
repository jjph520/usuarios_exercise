package co.edu.umanizales.usuarios.model;

public class Administrador extends Usuario {
    private String nivelAcceso;

    // Constructor
    public Administrador(Long id, String nombre, String email, String nivelAcceso) {
        super(id, nombre, email);
        this.nivelAcceso = nivelAcceso;
    }

    // Getter y Setter para nivelAcceso
    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
