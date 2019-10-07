package controller;
import modelo.ClientesDB;
import vista.GUIBusquedaClientes;
import java.awt.event.ActionEvent;

/**
 * Integrantes: Diana Bravo
 *              Cristian Belalcazar              
 */

/**Controlador de la GUIBusquedaClientes. Es la unica que tiene un controlador porque cambia
 *el estado del modelo. Las otras GUIs tienen el controlador dentro de la misma vista.
*/ 
public class GUIBusquedaClientesController implements java.awt.event.ActionListener{
    
    private ClientesDB modelo;
    private GUIBusquedaClientes vista;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.buscarClientesPorProfesion(vista.getProfesion());
    }
    
    public void addModel(ClientesDB m) {
        this.modelo = m;
    }
    
    public void addView(GUIBusquedaClientes v) {
        this.vista = v;
    }
}