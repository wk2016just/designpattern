package javacallback;

public class WkStudent extends Person{
		public WkStudent(String name,int a,int b){
			this.setName(name);
			this.setBegin(a);
			this.setEnd(b);
		}

		@Override
		public void say() {
			System.out.println(this.getName() + "say:"+ "a long student time~" );
			
		}
		
		public void call(){
			CallBackSuper.callback(this.getBegin(), this.getEnd(), this);
		}
		
		public static void main(String[] args){
			Wk wk = new Wk("wk2016",20,40);
			wk.call();
		}
		

}
