package proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

	ImageIcon icon;
	//图像的状态  使用状态模式 在加载与未加载之间切换
	ImageState imageLoadState;
	ImageState imageNonLoadState;
	ImageState imageCurr;
	//代理图片的位置
	URL imageUrl;
	public ImageProxy(URL imageUrl){
		this.imageUrl=imageUrl;
		imageNonLoadState=new ImageNonLoadState(this);
		imageLoadState=new ImageLoadState(this);
		imageCurr=imageNonLoadState;
	}
	
	/**
	 * 委托给当前状态进行处理
	 */
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		imageCurr.paintIcon(c, g, x, y);
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return imageCurr.getIconWidth();
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return imageCurr.getIconHeight();
	}


	public ImageState getImageCurr() {
		return imageCurr;
	}


	public void setImageCurr(ImageState imageCurr) {
		this.imageCurr = imageCurr;
	}


	public ImageState getImageLoadState() {
		return imageLoadState;
	}


	public ImageState getImageNonLoadState() {
		return imageNonLoadState;
	}


	public ImageIcon getIcon() {
		return icon;
	}


	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}


	public URL getImageUrl() {
		return imageUrl;
	}

}
