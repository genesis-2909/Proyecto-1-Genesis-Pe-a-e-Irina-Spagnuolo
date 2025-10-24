/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;
import proyecto1.Proyecto1;

/**
 *
 * Clase nodo que va a representar a cada usuario dentro de la red social,
 * cada nodo va a contener el nombre de usuario y la conexion con los demas
 * usuarios
 */
public class Nodo {
    String Nombre;
    Nodoconectar primeraconexion;

    public Nodo(String Nombre) {
        this.Nombre = Nombre;
        this.primeraconexion = null;
    }

/**
 *
 * Clase interna que es una lista simplemente enlazada de conexiones de nodo
 */    
    
    public class Nodoconectar {
        Nodo enlace;
        Nodoconectar pnext;

        public Nodoconectar(Nodo enlace) {
            this.enlace = enlace;
            this.pnext = null;
        }  
        
        public Nodo getEnlace() {
            return enlace;
        }

        public Nodoconectar getPnext() {
            return pnext;
        }

        public void setPnext(Nodoconectar siguiente) {
            this.pnext = siguiente;
        }
    }
    
    public void Conexion(Nodo enlace){
        Nodoconectar nuevo = new Nodoconectar(enlace);
        if (this.primeraconexion == null){
            this.primeraconexion = nuevo;
        }else{
        Nodoconectar aux = this.primeraconexion;
        while (aux.getPnext() != null){
            if (aux.getEnlace() == enlace)return;
            aux = aux.getPnext();
        }   
            if (aux.getEnlace() != enlace){
            aux.setPnext(nuevo);
            }
        }
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the primeraconexion
     */
    public Nodoconectar getPrimeraconexion() {
        return primeraconexion;
    }

    /**
     * @param primeraconexion the primeraconexion to set
     */
    public void setPrimeraconexion(Nodoconectar primeraconexion) {
        this.primeraconexion = primeraconexion;
    }  
    
}
