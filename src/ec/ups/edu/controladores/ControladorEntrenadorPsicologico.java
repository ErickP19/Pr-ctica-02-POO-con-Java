     /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.EntrenadorPsicologico;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author erics
 */
public class ControladorEntrenadorPsicologico {
    
    private List<EntrenadorPsicologico> lista;

    public ControladorEntrenadorPsicologico() {
        lista=new ArrayList<>();
    }
    
    public void create(EntrenadorPsicologico  objeto){
        lista.add(objeto);
    }
    
    public EntrenadorPsicologico read(int codigo){
        for (EntrenadorPsicologico entre : lista){
            if (entre.getCodigo() == codigo){
                return entre;
            }
        }
        return null;
    }
    
    public void update(EntrenadorPsicologico objeto){
        for (int i = 0; i < lista.size(); i++) {
            EntrenadorPsicologico elemento = new EntrenadorPsicologico();
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, elemento);
                break;
            }
            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            EntrenadorPsicologico elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
    
}
