import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import InterfacesImp.MultiplicacionImplementacion;

public class ServerRMI_test {
    public static void main(String[] arg) {
        try {
            MultiplicacionImplementacion multiplicacionImplementacion = new MultiplicacionImplementacion();
            Registry registry = LocateRegistry.createRegistry(9090);
            registry.rebind("Multiplicacion", multiplicacionImplementacion);
            System.out.println("Servidor corriendo");
        } catch (RemoteException e) {
            System.out.println(e.getMessage());

        }

    }

}