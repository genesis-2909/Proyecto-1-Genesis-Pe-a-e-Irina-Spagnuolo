/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * Se implementa una lista enlazada simple para poder manejar los usuarios
 */
public class Lista<T> {
    private Nodo<T> pfirst;
    private int size;

    public Lista() {
        this.pfirst = null;
        this.size = 0;
    }
    
    /** Nos dice si la lista esta vacia */
    public boolean es_vacio(){
        return pfirst == null;
    }
    
    public int Size(){
        return this.size;
    }
    
    /** Añade un elemento al final de la lista */
    public void InsertarFinal(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if (this.es_vacio()){
            this.pfirst = nuevo;
        }else{
            Nodo<T> aux = this.pfirst;
            while (aux.pnext != null){
                aux = aux.pnext;
            }
        aux.pnext = nuevo;
        }
    this.size++;
    }
    
    /** Se obtiene un elemento en el numero que se le pase */
    public T ObtenerIndice(int indice){
        if (indice < 0 || indice >= this.size){
            return null;
        }
        Nodo<T> aux = this.pfirst;
        for (int i = 0; i < indice; i++) {
            aux = aux.pnext;
            }
        return aux.dato;
        }
    
    /** Se elimina un elemento en el indice que se indica */
    public T EliminarIndice(int indice){
        if (indice < 0 || indice >= this.size){
        return null;
        }
        T dato;
        if (indice == 0){
            dato = this.pfirst.dato;
            this.pfirst = this.pfirst.pnext;
        }else{
            Nodo<T> aux = this.pfirst;
            for (int i = 0; i < indice - 1; i++) {
                aux = aux.pnext;
            }
        Nodo<T> nodoaeliminar = aux.pnext;
         dato = nodoaeliminar.dato;
        aux.pnext = nodoaeliminar.pnext;
        }
    this.size--;
    return dato;
    }
    
    /** Busca un dato de la lista y devuelve su indice, en caso de no encontrar
     devuelve -1 */
    public int indice(T dato){
        Nodo<T> aux = this.pfirst;
        for (int i = 0; i < this.size; i++) {
            if (aux.dato.equals(dato)){
                return i;
            }
        aux = aux.pnext;
        }
    return -1;
    }    
}
    
