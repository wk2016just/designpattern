package proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
/**
 * RMI注册服务和查找
 *
 */
public class RegisterRmiServer {
	
	public static void registerRmi(int port,String name,GumballMachineRemote remoteServer){
		try {
			//创建register端口监听
			LocateRegistry.createRegistry(port);
			//绑定服务
			Naming.rebind(name, remoteServer);
			//注册远程服务成功
			System.out.println("注册远程服务成功");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static GumballMachineRemote getRmiServer(String name){
		try {
			return (GumballMachineRemote) Naming.lookup(name);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
