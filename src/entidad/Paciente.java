package entidad;

import entidad.enums.SexoEnum;
import entidad.enums.TipoEnum;

/**
 * Esta clase representa los Pacientes
 * @author cooper15
 * @version 1.0, 04/12/2015
 */
public class Paciente {
   private String nombrePaciente;
   private String apellido1;
   private String apellido2;
   private String identificacion;
   private String telefono;
   private String email;
   private String fechaNacimiento;
   private String nacionalidad;
   private String direccion1;
   private String direccion2;
   entidad.enums.SexoEnum sexo;        //Masculino/Femenino
   private entidad.enums.TipoEnum tipo;
   
    /**
     * Obtiene el "sexo" del Paciente
     * @return un SexoEnum que representa el "sexo" del Paciente
     */
    public SexoEnum getSexo() {
        return sexo;
    }

    /**
     * Establece el "sexo" del Paciente
     * @param sexo de tipo SexoEnum que representa el "sexo" del Paciente
     */
    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtiene la "primera dirección" del Paciente
     * @return un String que representa la "primera dirección" del Paciente
     */
    public String getDireccion1() {
        return direccion1;
    }

    /**
     * Establece la "primera dirección" del Paciente
     * @param direccion1 de tipo String que representa la "primera dirección" del Paciente
     */
    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    /**
     * Obtiene la "segunda dirección"  del Paciente
     * @return un String que representa la "segunda dirección"  del Paciente
     */
    public String getDireccion2() {
        return direccion2;
    }

    /**
     * Establece la "segunda dirección"  del Paciente
     * @param direccion2 de tipo String que representa la "segunda dirección"  del Paciente
     */
    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    /**
     * Obtiene el "nombre" del Paciente
     * @return un String que representa el "nombre" del Paciente
     */
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    /**
     * Establece el "nombre" del Paciente
     * @param nombrePaciente de tipo String que representa el "nombre" del Paciente
     */
    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    /**
     * Obtiene el "primer apellido" del Paciente
     * @return un String que representa el "primer apellido" del Paciente
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Establece el "primer apellido" del Paciente
     * @param apellido1 de tipo String que representa el "primer apellido" del Paciente
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

     /**
     * Obtiene el "segundo apellido" del Paciente
     * @return un String que representa el "segundo apellido" del Paciente
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Establece el "segundo apellido" del Paciente
     * @param apellido2 de tipo String que representa el "segundo apellido" del Paciente
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

     /**
     * Obtiene la "identificación(cédula)" del Paciente
     * @return un String que representa  la "identificación(cédula)" del Paciente
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece la "identificación(cédula)" del Paciente
     * @param identificacion de tipo String que representa la "identificación(cédula)" del Paciente
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el "teléfono" del Paciente
     * @return un String que representa el "teléfono" del Paciente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el "teléfono" del Paciente
     * @param telefono de tipo String que representa el "teléfono" del Paciente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el "email" del Paciente
     * @return un String que representa el "email" del Paciente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el "email" del Paciente
     * @param email de tipo String que representa el "email" del Paciente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la "fecha de nacimiento" del Paciente
     * @return un String que representa la "fecha de nacimiento" del Paciente
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la "fecha de nacimiento" del Paciente
     * @param fechaNacimiento de tipo String que representa la "fecha de nacimiento" del Paciente
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene la "nacionalidad" del Paciente
     * @return un String que representa la "nacionalidad" del Paciente
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Establece la "nacionalidad" del Paciente
     * @param nacionalidad de tipo String que representa la "nacionalidad" del Paciente
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Obtiene el "tipo(Administrativo, Estudiante, Docente)" del Paciente
     * @return un String que representa el "tipo(Administrativo, Estudiante, Docente)" del Paciente
     */
    public TipoEnum getTipo() {
        return tipo;
    }

    /**
     * Establece el "tipo(Administrativo, Estudiante, Docente)" del Paciente
     * @param tipo de tipo TipoEnum que representa el "tipo(Administrativo, Estudiante, Docente)" del Paciente
     */
    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }
    
    
   
}
