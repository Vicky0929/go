package go;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * 面板
 * 
 * @author Administrator
 *
 */
public class GoPanel extends JPanel {
	/**
	 * 图片
	 */
	private BufferedImage image;
	/**
	 * 棋子
	 */
	private List<Piece> piecesList = new ArrayList<>();

	/**
	 * 构造方法
	 */
	public GoPanel() {
		try {
			image = ImageIO.read(new File("res/go.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 注册一个监听器
		addMouseListener(new PanelListener());
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 画背景
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);

		// 画棋子
		for (Piece piece : piecesList) {
			// g.fillOval(piece.getX(), piece.getY(), 30, 30);
			piece.draw(g);
		}
	}

	/**
	 * 面板中鼠标事件的监听（适配器模式）
	 * 
	 * @author Administrator
	 *
	 */
	class PanelListener extends MouseAdapter {

		// 白棋先走
		boolean isWhite = true;

		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);

			System.out.printf("(%d,%d)", e.getX(), e.getY());

			Piece piece = new Piece(e.getX(), e.getY(), isWhite);
			System.out.println(piece);
			piecesList.add(piece);

			// 点一下换个颜色
			isWhite = !isWhite;

			// 画布重新绘制
			repaint();

			//TODE
			// 局部
			//图片的绘制（）
			// repaint(x, y, width, height);
		}
	}
}
