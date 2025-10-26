/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoGrafo;
import EDD.Nodo;

/**
 *
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
            if (getUsers()[i].nombre.equals(nombre)) return getUsers()[i];
        }return null;
    }
    
    //agrega usuarios
    public void addUsers(String nombre){
        if (searchUser(nombre) == null) {
            getUsers()[cantidad++] = new InfoUsuario(nombre);
        }
    }
    
    //aqui se agrega la relacion que tiene un usuario con otro
    public void addConexion(String persona, String relacionado){
        InfoUsuario user = searchUser(persona);
        if (user != null){
            user.conexion.InsertarFinal(relacionado);
        }
    }
    
    //getters

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
