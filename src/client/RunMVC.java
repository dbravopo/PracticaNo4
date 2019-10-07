package client;
import controller.GUIBusquedaClientesController;
import modelo.ClientesDB;
import vista.GUIBusquedaClientes;
import vista.GUIClientesProfesion;
import vista.GUIEstadisticaPorSexo;
import vista.GUIEstadisticaPorSexoGrafica;

/**
 * Integrantes: Diana Bravo
 *              Cristian Belalcazar
 */

public class RunMVC {
    
    public RunMVC() 
    {
        //create Model and View
        ClientesDB myModel = new ClientesDB();
        GUIBusquedaClientes myView = new GUIBusquedaClientes(325, 50);
        GUIClientesProfesion myView2 = new GUIClientesProfesion(325, 250);
        GUIEstadisticaPorSexo myView3 = new GUIEstadisticaPorSexo(325, 450);
        GUIEstadisticaPorSexoGrafica myView4 = new GUIEstadisticaPorSexoGrafica(750, 280);
        
        myModel.addObserver(myView);
        myModel.addObserver(myView2);
        myModel.addObserver(myView3);
        myModel.addObserver(myView4);
        
        GUIBusquedaClientesController myController = new GUIBusquedaClientesController();
        myController.addModel(myModel);
        myController.addView(myView);
        myView.addController(myController);   
    }
        
}