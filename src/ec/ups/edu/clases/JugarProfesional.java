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
public final class JugarProfesional extends Jugador {
    
        private Jugador jugador;
        private String lugardeNacimiento;
        private double peso;
        private boolean titularsuplente;

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getLugardeNacimiento() {
        return lugardeNacimiento;
    }

    public void setLugardeNacimiento(String lugardeNacimiento) {
        this.lugardeNacimiento = lugardeNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTitularsuplente() {
        return titularsuplente;
    }

    public void setTitularsuplente(boolean titularsuplente) {
        this.titularsuplente = titularsuplente;
    }

    @Override
    public String toString() {
        return "JugarProfesional{" + "jugador=" + jugador + ", lugardeNacimiento=" + lugardeNacimiento + ", peso=" + peso + ", titularsuplente=" + titularsuplente + '}';
    }
        
}
