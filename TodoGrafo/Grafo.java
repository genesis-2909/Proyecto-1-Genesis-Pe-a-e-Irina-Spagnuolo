/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoGrafo;
import EDD.Nodo;

/**
 *
 * @author Gerardo Bloise
 */
public class Grafo {
    private InfoUsuario[] users;
    private int cantidad;
    
    //se utiliza para pasar la cantidad de usuarios
    public Grafo(int MaxUsers){
        users = new InfoUsuario[MaxUsers];
        cantidad = 0;
    }
    
    //busca el usuario del que se quiere saber
    public InfoUsuario searchUser(String nombre){
        for (int i = 0; i < getCantidad(); i++) {
            
        }
    }

    /**
     * @return the users
     */
    public InfoUsuario[] getUsers() {
        return users;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }
    
    
    
    
    
    
    
}
