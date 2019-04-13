/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

/**
 *
 * @author erics
 */
public abstract class Jugador {

        private int edad ;
        private double estatura;
        private double salario;
        private String posiciondeJuego;
        private Persona persona;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPosiciondeJuego() {
        return posiciondeJuego;
    }

    public void setPosiciondeJuego(String posiciondeJuego) {
        this.posiciondeJuego = posiciondeJuego;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Jugador{" + "edad=" + edad + ", estatura=" + estatura + ", salario=" + salario + ", posiciondeJuego=" + posiciondeJuego + ", persona=" + persona + '}';
    }
        
}
