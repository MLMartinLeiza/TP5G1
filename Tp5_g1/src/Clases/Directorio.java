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
    public static boolean agregarContacto(long telefono, Contactos cont) {
        //verificamos q telefono sea un numero valido y el contacto no sea null
        if (telefono <= 0 || cont == null) {
            return false;
        }

        //verificamos q el telefono no este duplicado
        if (informacion.containsKey(telefono)) {
            return false;
        }

        informacion.put(telefono, cont);

        return true;

    }

    public static Set<Long> todosLosTelefonos() {
        return new TreeSet<>(informacion.keySet());
    }

    //en base al nro. de teléfono retorna el Contacto asociado al mismo.
    public static Contactos buscarContacto(long telefono) {
        //nos devuelve el contacto con respecto al telefono asociado
        return informacion.get(telefono);

    }

    // en base a un apellido nos devuelve un Set<Long> con los números de teléfono asociados a dicho apellido.
    public static Set<Long> buscarTelefonoPorApellido(String apellido) { 
        TreeSet<Long> numeroEncontrado = new TreeSet<>(); //Creo un TreeSet para almacenar coincidencias
        for (Map.Entry<Long, Contactos> c : informacion.entrySet()) { //Recorro el TreeMap información
            if (c.getValue().getApellido().equalsIgnoreCase(apellido)) { //Comparo lo que recibo por parámetro
                numeroEncontrado.add(c.getKey()); //Si hay coincidencia lo agrego al TreeSet
            }
        }
        return numeroEncontrado; //Retorno lo que almacene en el TreeSet
    }

    //en base a una ciudad nos devuelve un ArrayList con los Contactos asociados a dicha ciudad.
    public  Contactos buscarContactoPorDNI(int dni){
        // recorremos el mapa buscando un contacto q tenga el dni igual al ingresado 
       for (Contactos c: informacion.values()){
           if(c.getDni() == dni){
               // si lo encuentra devolvemos el contacto
               return c;
           }
       }
       // si no retornamos a null 
       return null;

       
    }

    public static Set<Integer> TodosLosDni() {
        Set<Integer> listaDni = new TreeSet<>();

        for (Contactos dni : informacion.values()) {
            listaDni.add(dni.getDni());
        }
        return listaDni;
    }
    // NO SABEMOS SI LO VAMOS A USAR
    public static boolean borrarContacto(Long telefono) {
       if(telefono== null)return false;

       // busca el telefono lo elimina si no lo encuentra devuelve false
       
       if(informacion.remove(telefono)!= null){
           return true;
       }else{
           return false;
       }
    }
    
  
    
    public static Long BuscarTlefonoPorContacto(Contactos cont){
        for(Map.Entry<Long, Contactos> entry : informacion.entrySet()){
            if(entry.getValue().equals(cont)){
                return entry.getKey();
            }
        }
        return null;
    }
}
