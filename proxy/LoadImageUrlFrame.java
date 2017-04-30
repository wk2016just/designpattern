package proxy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 虚拟代理-->用于代理大开销的资源
 *   使用代理 在未加载资源时，显示提示信息
 *
 */
public class LoadImageUrlFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenu menu;
	JMenuBar menuBar;
	Map<String, String> imageResources = new HashMap<String, String>();
	ImageComponent imageComponent;

	public LoadImageUrlFrame() {

		initResources();

		menu = new JMenu("加载图片");
		//添加菜单项
		addMenuItem(menu);
		menuBar = new JMenuBar();
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
		//初始化图片
		Icon icon=null;
		try {
			icon = new ImageProxy(new URL(imageResources.get("熊黛林")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//添加图片组件
		imageComponent=new ImageComponent(icon);
		getContentPane().add(imageComponent);
		
		// 初始化操作
		setSize(800, 500);
		setLocation((getToolkit().getScreenSize().width-getWidth())/2, (getToolkit().getScreenSize().height-getHeight())/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * 添加菜单项
	 */
	private void addMenuItem(JMenu menu2) {
		// TODO Auto-generated method stub
		for (Iterator iterator = imageResources.keySet().iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			//添加菜单项
			JMenuItem menuItem=new JMenuItem(name);
			menuItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//当点击菜单项的时候
					//替换图片组件中的图片 并将frame重绘
					try {
						//替换图像组件中的图片
						imageComponent.setIcon(new ImageProxy(new URL(imageResources.get(e.getActionCommand()))));
						//重绘面板
						repaint();
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			menu2.add(menuItem);
		}
	}

	/**
	 * 初始化图片资源
	 */
	private void initResources() {
		// TODO Auto-generated method stub
		imageResources
				.put("古力娜扎",
						"http://cdn.duitang.com/uploads/item/201207/27/20120727130449_hSxQk.jpeg");
		imageResources.put("熊黛林",
				"http://ent.shangdu.com/stardata/P_5962597_1__1869907784.jpg");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoadImageUrlFrame frame = new LoadImageUrlFrame();

	}

}
