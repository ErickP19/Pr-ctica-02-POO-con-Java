/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.JugarProfesional;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author erics
 */
public class ControladorJugadorProfesional1 {
    
     
    private SortedSet<JugarProfesional> lista;
    private int codigo;
    
    public ControladorJugadorProfesional1(){
        lista= new TreeSet<>(); 
        codigo=1;
    }
    
    public void create(JugarProfesional obj){
        codigo++;
        obj.setCodigo(codigo);
        lista.add(obj);
    }
    
    public  JugarProfesional read (int codigo){
        for (JugarProfesional ju : lista) {
            if(ju.getCodigo()== codigo){
                return ju;
            }
        }
       return null;         
        }
    
    public void update(JugarProfesional obj){
        if(lista.contains(obj)){
            lista.remove(obj);
            lista.add(obj);
        } 
    }
    
    public void delete(JugarProfesional obj){
        for (JugarProfesional ju : lista) {            
            if(obj.getCodigo() == codigo){
                lista.remove(obj);
                break;
            }            
        }      
    }
    
    public JugarProfesional imprimir(JugarProfesional obj){
        System.out.println("\t Lista Ordenada");
        for (JugarProfesional ju : lista) {
            System.out.println(ju);            
        }            
        return null;        
    }
    
    
    
}
