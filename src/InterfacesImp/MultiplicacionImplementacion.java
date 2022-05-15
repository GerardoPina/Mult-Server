package InterfacesImp; //Agregar el paquete donde este la interfaz remota 

import Interfaces.Multiplicacion;// Importar la clase Adder para que pueda ser utilizada 

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MultiplicacionImplementacion extends UnicastRemoteObject implements Multiplicacion {

    public MultiplicacionImplementacion() throws RemoteException {
        super();
    }

    @Override
    public int multiplicacion(int a, int b) throws RemoteException {
        return a * b;
    }
}
