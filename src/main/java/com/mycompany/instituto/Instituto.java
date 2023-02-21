package com.mycompany.instituto;

import java.util.Scanner;

public class Instituto {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        
        Profesor profesor = new Profesor();
        Alumno alumno = new Alumno();
        
        System.out.println("Leyendo datos del profesor: \n");
        System.out.print("DNI: ");
        profesor.setDNI(sca.nextLine());
        System.out.println("");
        System.out.print("Nombre: ");
        profesor.setNombre(sca.nextLine());
        System.out.println("");
        System.out.print("Apellidos: ");
        profesor.setApellidos(sca.nextLine());
        System.out.println("");
        System.out.print("Código de docente: ");
        profesor.setCodigoDocente(sca.nextLine());
        System.out.println("");
        
        System.out.println("Mostrando datos del profesor: \n");
        System.out.println("DNI: " + profesor.getDNI());
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Apellidos: " + profesor.getApellidos());
        System.out.println("Código de docente: " + profesor.getCodigoDocente());
    }
}
