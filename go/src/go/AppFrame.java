package go;

import javax.swing.JFrame;

/**
 * 
 * @author Administrator
 *
 */
public class AppFrame extends JFrame {
	/**
	 * 棋盘
	 */
	private GoPanel goPanel;

	private static final long serialVersionUID = 1L;

	/**
	 * 构造方法
	 */
	public AppFrame() {

		ui();
		setVisible(true);
		
	}

	private void ui() {
		setTitle("五子棋");
		setSize(506, 528);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//添加面板
		goPanel = new GoPanel();
		add(goPanel);
	}
}
