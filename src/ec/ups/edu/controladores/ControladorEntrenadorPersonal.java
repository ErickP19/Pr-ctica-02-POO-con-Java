/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.EntrenadorPersonal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erics
 */
public class ControladorEntrenadorPersonal {
    
    private List<EntrenadorPersonal> lista;

    public ControladorEntrenadorPersonal() {
        lista=new ArrayList<>();
    }
    
    public void create(EntrenadorPersonal objeto){
        lista.add(objeto);
    }
    
    public EntrenadorPersonal read(int codigo){
        for (EntrenadorPersonal entre1 : lista){
            if (entre1.getCodigo() == codigo){
                return entre1;
            }
        }
        return null;
    }
    
    public void update(EntrenadorPersonal objeto){
        for (int i = 0; i < lista.size(); i++) {
            EntrenadorPersonal elemento = new EntrenadorPersonal();
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, elemento);
                break;
            }
            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            EntrenadorPersonal elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
    
    
}
