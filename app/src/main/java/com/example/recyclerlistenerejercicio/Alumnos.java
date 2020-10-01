package com.example.recyclerlistenerejercicio;

import java.util.ArrayList;

public class Alumnos {

        String nombre;
        String apellido;
        String modulo;
        String curso;


    public Alumnos(String nombre, String apellido, String modulo, String curso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.modulo = modulo;
        this.curso = curso;


    }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

         public void setApellido(String apellido) {
             this.apellido = apellido;
        }

    public void setModulo(String modulo) {
            this.modulo = modulo;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
        return apellido;
        }

        public String getModulo() {
            return modulo;
        }

        public String getCurso() {
            return curso;
        }



}
