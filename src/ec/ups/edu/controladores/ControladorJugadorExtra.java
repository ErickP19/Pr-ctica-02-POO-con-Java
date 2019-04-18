/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;
import ec.ups.edu.clases.JugadorExtra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erics
 */
public class ControladorJugadorExtra {
     private List<JugadorExtra> lista;

    public ControladorJugadorExtra() {
        lista=new ArrayList<>();
    }
    
    public void create(JugadorExtra  objeto){
        lista.add(objeto);
    }
    
    public JugadorExtra read(int codigo){
        for (JugadorExtra juga : lista){
            if (juga.getCodigo() == codigo){
                return juga;
            }
        }
        return null;
    }
    
    public void update(JugadorExtra objeto){
        for (int i = 0; i < lista.size(); i++) {
            JugadorExtra elemento = new JugadorExtra();
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, elemento);
                break;
            }
            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            JugadorExtra elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
    
}
