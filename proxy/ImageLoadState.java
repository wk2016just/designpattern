package proxy;

import java.awt.Component;
import java.awt.Graphics;

public class ImageLoadState implements ImageState {

	ImageProxy imageProxy;
	
	
	public ImageLoadState(ImageProxy imageProxy) {
		super();
		this.imageProxy = imageProxy;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		imageProxy.getIcon().paintIcon(c, g, x, y);
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return imageProxy.getIcon().getIconWidth();
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return imageProxy.getIcon().getIconHeight();
	}

}
