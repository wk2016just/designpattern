package compound;


/**
 * ¶ìÊÊÅäÆ÷  ½«¶ì×ª»»ÎªÑ¼×Ó
 */
public class GooseAdapter implements Quackable {

	Creak creak;
	public GooseAdapter(Creak creak) {
		// TODO Auto-generated constructor stub
		this.creak=creak;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		creak.creak();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
