/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

import java.util.Date;

/**
 *
 * @author erics
 */
public final class EntrenadorPersonal extends Entrenador {

        private Entrenador entrenador;
        private String titulo;
        private String tipoIdioma;
        private String rutina;
        private Date fechadeContratacion;
        private Date vencimientoContrato;

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoIdioma() {
        return tipoIdioma;
    }

    public void setTipoIdioma(String tipoIdioma) {
        this.tipoIdioma = tipoIdioma;
    }

    public String getRutina() {
        return rutina;
    }

    public void setRutina(String rutina) {
        this.rutina = rutina;
    }

    public Date getFechadeContratacion() {
        return fechadeContratacion;
    }

    public void setFechadeContratacion(Date fechadeContratacion) {
        this.fechadeContratacion = fechadeContratacion;
    }

    public Date getVencimientoContrato() {
        return vencimientoContrato;
    }

    public void setVencimientoContrato(Date vencimientoContrato) {
        this.vencimientoContrato = vencimientoContrato;
    }

    @Override
    public String toString() {
        return "EntrenadorPersonal{" + "entrenador=" + entrenador + ", titulo=" + titulo + ", tipoIdioma=" + tipoIdioma + ", rutina=" + rutina + ", fechadeContratacion=" + fechadeContratacion + ", vencimientoContrato=" + vencimientoContrato + '}';
    }
                
}
