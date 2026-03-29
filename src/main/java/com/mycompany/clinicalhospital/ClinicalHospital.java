package com.mycompany.clinicalhospital;

import Modelos.Consulta;
import Modelos.Hospital;
import Modelos.Medico;


public class ClinicalHospital {

    public static void main(String[] args) {
        //hospital creado
        Hospital h = new Hospital("Clinica Santa Maria", "Cartagena");
        
        // creamos  3 consultas
        Consulta c1 = new Consulta("22//02//2026", "fiebre y dolor de cabeza", "Gripe severa", 20);
        Consulta c2 = new Consulta("20//03//2026", "dedo roto", "Opereacion y yeso", 61);
        Consulta c3 = new Consulta("25//01//2026", "Vomito y diarrea", "virosis", 16);
        
        //Registramos las 3 consultas
        System.out.println("\n REGISTRO DE CONSULTAS\n");
        
        h.registrarConsulta(c1);
        h.registrarConsulta(c2);
        h.registrarConsulta(c3);
        //Creamos dos medicos :) 
        
        Medico m1 = new Medico("LP-109", "General", "David Ignacio", 33, "1099", "314 3345357", 203);
        Medico m2 = new Medico("LP-108", "Especialista", "Carlos Perez", 65, "3489", "323 3555891", 303);
       
        //Primero presentemos a los medicoss
        System.out.print("\n-Presentacion de medicos-\n");
        m1.presentar();
        m2.presentar();
        
        //funcion de verificador de edad
        System.out.println("\n-Verificador de edad-\n");
        System.out.println("Verificador de edad = " + m1.Verificador());
        System.out.println("Verificador de edad = " + m2.Verificador());
        
        System.out.println("\n-Atender consulta y verificar edad-\n");
        //atienden la consulta y usamos la funcin que creamod para vereificar
        m1.atender(c1);
        m2.atender(c3);
        
        //ahora modifiquemos (minimo 3 setter entonces  modifiquemos las de medicos)
        m1.setEdad(36); // ahora  tiene 36
        m1.setTarjetaProfesional("LP-110");// ahora es 110
        m2.setConsultorio(403);// lo movieron al 403
        //mostramos la lista de consultas
        h.listaConsulta();
        System.out.println("\n-Mostrar reporte con toString()\n");
        System.out.println(m1);
        System.out.println(m2);
        
    }
}
