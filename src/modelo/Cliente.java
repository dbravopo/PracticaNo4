package modelo;

/**
 * Integrantes: Diana Bravo
 *              Cristian Belalcazar
 */
//Representa la información básica de un cliente de la agancia de viajes.
public class Cliente {
    
    private String nombres;
    private String profesion;
    private String sexo;
    
    public Cliente(String nombres, String profesion, String sexo) {
        this.nombres = nombres;
        this.profesion = profesion;
        this.sexo = sexo;
    }
    
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }    
    
}