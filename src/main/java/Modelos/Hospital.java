package Modelos;

import java.util.ArrayList;

public class Hospital {
    private String nombre;
    private String ciudad;
    private ArrayList<Consulta>consultas;

    public Hospital(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consultas = new ArrayList<>();     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
    
    public void registrarConsulta(Consulta c){
        this.consultas.add(c);
        System.out.println("===Consulta registrada con exito===");
    }
    
    public void listaConsulta(){
        System.out.println("-Lista de consultas-");
        for( Consulta c : consultas ){
            System.out.println("----------");
            System.out.println(c.toString());
            System.out.println("----------");
        }
    }
}
