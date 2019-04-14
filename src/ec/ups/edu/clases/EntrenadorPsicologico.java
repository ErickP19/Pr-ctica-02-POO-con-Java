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
public final class EntrenadorPsicologico extends Entrenador implements Principal  {
   
       private Entrenador entrenador;
       private String titulo;
       private Date FechaContratacion;
       private Date vencimientoContrato;
    // constructor

    public EntrenadorPsicologico(Entrenador entrenador, String titulo, Date FechaContratacion, Date vencimientoContrato, Persona persona, double sueldo, int edad, String recomendaciones, int codigo, String nombre, String cedula, int telefono, String direccion, String correo) {
        super(persona, sueldo, edad, recomendaciones, codigo, nombre, cedula, telefono, direccion, correo);
        this.entrenador = entrenador;
        this.titulo = titulo;
        this.FechaContratacion = FechaContratacion;
        this.vencimientoContrato = vencimientoContrato;
    }
       
       // get and set

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

    public Date getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(Date FechaContratacion) {
        this.FechaContratacion = FechaContratacion;
    }

    public Date getVencimientoContrato() {
        return vencimientoContrato;
    }

    public void setVencimientoContrato(Date vencimientoContrato) {
        this.vencimientoContrato = vencimientoContrato;
    }

    @Override
    public String toString() {
        return super.toString()+ "EntrenadorPsicologico{" + "entrenador=" + entrenador + ", titulo=" + titulo + ", FechaContratacion=" + FechaContratacion + ", vencimientoContrato=" + vencimientoContrato + '}';
    }
    public static int pedirHoras(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce las horas que ha trabajado: ");
		int horas = teclado.nextInt();
		return horas;
	}     
    
    public double calcularSueldo (){
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

