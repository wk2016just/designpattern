package proxy;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ImageNonLoadState implements ImageState {

	ImageProxy imageProxy;
	public ImageNonLoadState(ImageProxy imageProxy){
		this.imageProxy=imageProxy;
	}
	
	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		g.drawString("正在加载图片中。。。", x, y);
		//使用线程 加载网络资源 加载完成后 重绘面板
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//修改图片状态
				imageProxy.setIcon(new ImageIcon(imageProxy.getImageUrl()));
				imageProxy.setImageCurr(imageProxy.getImageLoadState());
				//重绘
				c.repaint();
			}
		}).start();
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 400;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 400;
	}

}
