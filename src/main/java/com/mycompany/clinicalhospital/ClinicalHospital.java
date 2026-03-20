package com.mycompany.clinicalhospital;

import Modelos.Consulta;
import Modelos.Hospital;
import Modelos.Medico;
import java.util.ArrayList;


public class ClinicalHospital {

    public static void main(String[] args) {
        Hospital h = new Hospital("Clinica Santa Maria", "Cartagena", new ArrayList<>());

        Consulta c1 = new Consulta("20/03/2026", "Fiebre", "Gripe", 20);
        Consulta c2 = new Consulta("21/03/2026", "Fractura", "Yeso", 60);
        Consulta c3 = new Consulta("22/03/2026", "Chequeo", "Sano", 15);
        
        h.registrarConsulta(c1);
        h.registrarConsulta(c2);
        h.registrarConsulta(c3);

        Medico m1 = new Medico("TP123", "General", "Juan", 30, "1010", "3001", 101);

        System.out.println("\n--PROCESO_DE_ATENCION--");
        m1.atender(c1); 

        System.out.println("\n--REPORTES--");
        System.out.println(h.getNombre() + " tiene " + h.getConsultas().size() + " consultas registradas.");
        System.out.println(m1.toString());
        System.out.println("Validacion Edad: " + m1.Verificador());

    }
}
