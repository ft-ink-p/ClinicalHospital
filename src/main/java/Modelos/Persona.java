
package Modelos;


public class Persona {
 
    private String nombre;
    private int edad;
    private String cedula;
    private String telefono;
    
    public Persona(String nombre, int edad, String cedula, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombr(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
 
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
    
    public String Verificador(){
        if(this.edad >=20 && this.edad <=60 ){
            return "La persona es mayor de  edad \n";
        } else if (this.edad <= 18 ) {
            return "La persona es menor de edad \n";
        } else {
             return "La persona es un Adulto mayor (mayor de 60) \n";
        }
    }
    
}
