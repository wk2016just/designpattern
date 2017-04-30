package proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 * 远程服务对象
 *
 */
public class GumballMachine extends UnicastRemoteObject implements
		GumballMachineRemote {
	String location;
	String description;
	int count;
	State currentState;

	private static final long serialVersionUID = 1L;

	/**
	 * 因为UnicastRemoteObject构造器需要处理异常 因为RMI在网络上传输 会发生未知的异常
	 * 
	 * @throws RemoteException
	 */
	protected GumballMachine() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public GumballMachine(String location, String description, int count) throws RemoteException {
		super();
		this.location = location;
		this.description = description;
		this.count = count;
		if(count>0){
			this.currentState = new NoMoneyState();
		}
		
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public State getCurrState() {
		// TODO Auto-generated method stub
		return currentState;
	}

}
