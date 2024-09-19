/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 *
 * @author andres
 */
public class Nodo {
    
    private int element;
    private Nodo next;
    private Nodo previous;

    public Nodo(int elemento) {
        this.element = elemento;
        this.next = null;
        this.previous = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int elemento) {
        this.element = elemento;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo siguiente) {
        this.next = siguiente;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }   
}
    

