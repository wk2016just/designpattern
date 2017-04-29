package javacallback;

public abstract class Person {
	private String name;
	private int begin;
	private int end;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	
	public int getBegin() {
		return begin;
	}
	public void setBegin(int begin) {
		this.begin = begin;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public abstract void say();

}
