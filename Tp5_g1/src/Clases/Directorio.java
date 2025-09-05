/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static java.lang.reflect.Array.set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;

/**
 *
 * @author arceb
 */
public class Directorio {
     private long telefono;
    
    private static TreeMap<Long, Contactos> informacion = new TreeMap<>();
    
    //permite registrar un nuevo contacto con su respectivo nro. de teléfono. Siendo el nro. del teléfono la clave del mismo.
    public static boolean agregarContacto(long telefono, Contactos cont){
        //verificamos q telefono sea un numero valido y el contacto no sea null
        if (telefono <=0 || cont == null){
            return false;
        }
        
        //verificamos q el telefono no este duplicado
        
        if(informacion.containsKey(telefono)){
            return false;
        }
        
        informacion.put(telefono, cont);
        
        return true;
        
        
    }
    
    public static Set <Long> todosLosTelefonos (){
        return new TreeSet<>(informacion.keySet());
    }
    //en base al nro. de teléfono retorna el Contacto asociado al mismo.
    public Contactos buscarContacto(long telefono){
           //nos devuelve el contacto con respecto al telefono asociado
        return informacion.get(telefono);
        
    }
    
    // en base a un apellido nos devuelve un Set<Long> con los números de teléfono asociados a dicho apellido.
    public void buscarTelefono(){
        
    
    }
    
    //en base a una ciudad nos devuelve un ArrayList con los Contactos asociados a dicha ciudad.
    public void buscarContactos(){
    
    //en base al número de teléfono elimina el contacto del directorio.   
    }
    
    public static Set<Integer> TodosLosDni(){
        Set<Integer> listaDni = new TreeSet<>();
        
        for (Contactos dni : informacion.values()) {
            listaDni.add(dni.getDni());
        }
        return listaDni;
    }
    
    
    
    public TreeMap<Long, Contactos> borrarContacto(int dni){
       informacion.containsValue(dni);
        
       return informacion;
    }
}
