/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

import ec.ups.edu.interfaces.Principal;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author erics
 */
public final class EntrenadorPersonal extends Entrenador implements Principal{

        private Entrenador entrenador;
        private String titulo;
        private String tipoIdioma;
        private String rutina;
        private Date fechadeContratacion;
        private Date vencimientoContrato;
        
        //constructor

    public EntrenadorPersonal(Entrenador entrenador, String titulo, String tipoIdioma, String rutina, Date fechadeContratacion, Date vencimientoContrato, Persona persona, double sueldo, int edad, String recomendaciones, int codigo, String nombre, String cedula, int telefono, String direccion, String correo) {
        super(persona, sueldo, edad, recomendaciones, codigo, nombre, cedula, telefono, direccion, correo);
        
    } 
        //get and set

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
        return super.toString()+"EntrenadorPersonal{" + "entrenador=" + entrenador + ", titulo=" + titulo + ", tipoIdioma=" + tipoIdioma + ", rutina=" + rutina + ", fechadeContratacion=" + fechadeContratacion + ", vencimientoContrato=" + vencimientoContrato + '}';
    }
     public static int pedirHoras(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce las horas que ha trabajado: ");
		int horas = teclado.nextInt();
		return horas;
	}     
    public double calcularSueldo(){
        int resultado = 0, horasExtra = 0; 						
		final int horasNormales = 35;
		if (pedirHoras() <= 35){			
			resultado = pedirHoras() * 15;		
		} else{		
			horasExtra = (pedirHoras() - 35) * 22;		
			resultado = horasNormales * 15 + horasExtra;	
		}
		return resultado;
	}
        
    }

  

