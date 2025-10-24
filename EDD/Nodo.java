/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *Se crea un nodo genérico para poder ser reutilizado e implementado 
 * en todas las demás clases.
 *
 */
public class Nodo<T> {
    Nodo<T> pnext;
    T dato;

    public Nodo(T dato) {
        this.pnext = null;
        this.dato = dato;
    }  
}
