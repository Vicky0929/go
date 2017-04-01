package go;

import javax.swing.JFrame;

/**
 * 
 * @author Administrator
 *
 */
public class AppFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * 构造方法
	 */
	public AppFrame() {

		setTitle("五子棋");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
