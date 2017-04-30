package proxy;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Icon icon;
	public ImageComponent(Icon icon){
		this.icon=icon;
	}
	
	
	/**
	 * »æÖÆÍ¼Æ¬×é¼þ
	 */
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int x=icon.getIconWidth();
		int y=icon.getIconHeight();
		x=(800-x)/2;
		y=(500-y)/2;
		icon.paintIcon(this, g, x, y);
	}



	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	
	
}
