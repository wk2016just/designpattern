package javacallback;

public class CallBackSuper {
	
	public static void callback(int a,int b,Person p){
		int t = b-a;
		p.say();
		System.out.println("has been " + t + " years");
		
	}

}
