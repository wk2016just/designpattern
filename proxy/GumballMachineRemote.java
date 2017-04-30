package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote{
    /**
     * 每个方法都必须抛出throws RemoteException异常 
     * @return
     * @throws RemoteException
     */
	public String getLocation() throws RemoteException;
	public int getCount() throws RemoteException;
	public String  getDescription() throws RemoteException;
	public State getCurrState() throws RemoteException;
	
}
