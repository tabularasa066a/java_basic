package rmi_test;
import java.rmi.*;

public interface helloIf extends Remote {
  public String helloMsg() throws RemoteException;
}