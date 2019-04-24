/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.JugarProfesional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author erics
 */
public class ControladorMap { 
    
  private Map<Integer ,JugarProfesional> lista;
  private int codigo;
    public ControladorMap() {
        lista=new HashMap<>();
        codigo = 1;
    }
    
    public void create(JugarProfesional  objeto){
        objeto.setCodigo(codigo);
        codigo ++;
        lista.keySet();
        
    }
    /*
    public JugarProfesional read(int codigo){
        for (JugarProfesional juga1 : lista){
            if (juga1.getCodigo() == codigo){
                return juga1;
            }
        }
        return null;
    }
    
    public void update(JugarProfesional objeto){
        for (int i = 0; i < lista.size(); i++) {
            JugarProfesional elemento = new JugarProfesional();
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, elemento);
                break;
            }
            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            JugarProfesional elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
    */
    
}
