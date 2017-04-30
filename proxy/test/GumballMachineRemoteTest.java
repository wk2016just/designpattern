package proxy.test;


import java.rmi.RemoteException;

import javax.imageio.spi.RegisterableService;

import proxy.GumballMachine;
import proxy.GumballMachineRemote;
import proxy.RegisterRmiServer;


public class GumballMachineRemoteTest {


	public void test() {
		try {
			//创建远程服务
			GumballMachineRemote remoteServer=new GumballMachine("中科大", "科学大道", 100);
			//绑定
			int port=4567;
			RegisterRmiServer.registerRmi(port,"rmi://192.168.1.101:"+port+"/remoteServer", remoteServer);
			//等待客户端的查找RMI服务
			while(true){
				
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testClient(){
		int port=4567;
		GumballMachineRemote remoteServer=RegisterRmiServer.getRmiServer("rmi://192.168.1.101:"+port+"/remoteServer");
		try {
			System.out.println(remoteServer.getCount());
			System.out.println(remoteServer.getLocation());
			System.out.println(remoteServer.getDescription());
			System.out.println(remoteServer.getCurrState());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
