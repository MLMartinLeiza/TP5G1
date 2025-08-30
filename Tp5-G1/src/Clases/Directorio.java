/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
