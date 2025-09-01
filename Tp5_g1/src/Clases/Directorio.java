/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.TreeMap;

/**
 *
 * @author arceb
 */
public class Directorio {
     private long telefono;
    
    TreeMap<Long, Contactos> informacion = new TreeMap<>();
    
    //permite registrar un nuevo contacto con su respectivo nro. de teléfono. Siendo el nro. del teléfono la clave del mismo.
    public void agregarContacto(){
        
        
    }
    
    //en base al nro. de teléfono retorna el Contacto asociado al mismo.
    public void buscarContacto(){
    
    }
    
    // en base a un apellido nos devuelve un Set<Long> con los números de teléfono asociados a dicho apellido.
    public void buscarTelefono(){
    
    }
    
    //en base a una ciudad nos devuelve un ArrayList con los Contactos asociados a dicha ciudad.
    public void buscarContactos(){
    
    //en base al número de teléfono elimina el contacto del directorio.   
    }
    public void borrarContacto(){
    
    }
}
