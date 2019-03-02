package empresa;

/**
 * @author Diego Parra
 */
public class Empleado
{

    // Constructor por defecto
    public Empleado() 
    {
    }
    // Atributos 
    private String nombre;
    private short edad;
    private String direccion;
    private String telefono;
    
    /* Metodos
     * @return the nombre
     */
    public String getNombre() 
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public short getEdad() 
    {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(short edad) 
    {
        this.edad = edad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion()
    {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() 
    {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
}
