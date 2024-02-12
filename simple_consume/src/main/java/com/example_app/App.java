package com.example_app;

import com.example_1.Persona;

public class App {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Cristian");
        persona.setEdad(41);
        //System.out.println(persona.getId() + " " + persona.getNombre());
        System.out.println(persona.toString());


    }
}
