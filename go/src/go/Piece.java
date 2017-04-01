package go;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Piece {

	BufferedImage image;

	private int size = 30;
	private int x;
	private int y;

	private boolean isWhite = true;

	/**
	 * 构造方法
	 * 
	 * @param x
	 * @param y
	 * @param isWhite
	 */
	public Piece(int x, int y, boolean isWhite) {
		super();
		this.x = x - size / 2;
		this.y = y - size / 2;
		this.isWhite = isWhite;
	}

	public boolean getisWhite() {
		return isWhite;
	}

	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Piece [x=" + x + ", y=" + y + ", isWhite=" + isWhite + "]";
	}

	public void draw(Graphics g) {
		g.setColor(isWhite ? Color.WHITE : Color.BLACK);
		g.fillOval(x, y, size, size);
	}
}
