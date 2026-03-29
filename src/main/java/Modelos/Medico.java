
package Modelos;

public class Medico extends Persona {
    private String tarjetaProfesional;
    private String especializacion;
    private int consultorio;

    public Medico(String tarjetaProfesional, String especializacion, String nombre, int edad, String cedula,String telefono, int consultorio) {
        super(nombre, edad,cedula,telefono);
        this.tarjetaProfesional = tarjetaProfesional;
        this.especializacion = especializacion;
        this.consultorio = consultorio;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(int consultorio) {
        this.consultorio = consultorio;
    }

    @Override
    public String toString() {
        return super.toString()+ "Medico{" + "tarjetaProfesional=" + tarjetaProfesional + ", especializacion=" + especializacion + ", consultorio=" + consultorio + '}';
    }
   
    public void atender(Consulta c){
        System.out.println("\n===Consulta-medica===\n");
        System.out.println("Nombre de Medico '"+ getNombre() + "' Motivo de consulta '"+ c.getMotivo());
        System.out.println("Fecha de Consulta '"+ c.getFecha()+"'");
        System.out.println("-Toma de datos.....\n.....\n.....\n.....\n.....");
        System.out.println("Diagnostico  de consulta '"+ c.getDiagnostico()+"'");
        System.out.println("\n===FIN DE CONSULTA=== \n");
    }
    
    public void presentar(){
        System.out.println("\n===Presentarse===\n");
        System.out.println("Buenos dias, se encuentra con el medico '"+ getNombre()+ "' Con especializacion en '"+getEspecializacion() +"' en el consultorio '"+getConsultorio()+"'\n");
    }
    
}


