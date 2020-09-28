package tbs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SimpleGfx extends JPanel {
	private static final long serialVersionUID = 1L;
	private final int width;
	private final int height;
	private BufferedImage image;
	private Graphics2D graphics;
	private int rgb;
	private ArrayList<FrameListener> frameListeners = new ArrayList<FrameListener>();
	
	public static SimpleGfx startup(int width, int height) {	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Simple graphics window");

		SimpleGfx screen = new SimpleGfx(width, height);
		frame.getContentPane().add(screen);

		frame.pack();
		frame.setVisible(true);

		ActionListener frameListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				screen.repaint();
			}
		};
		Timer timer = new Timer(20, frameListener);
		timer.start();
		
		return screen;
	}
	
	private SimpleGfx(int width, int height) {
		this.width = width;
		this.height = height;
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		graphics = (Graphics2D)image.createGraphics();
		setPreferredSize(new Dimension(width, height));
		
		setColour(0xffffff);
		clear();
		setColour(0);
	}
	
	public void addFrameListener(FrameListener f) {
		frameListeners.add(f);
	}
	
	public void removeFrameListener(FrameListener f) {
		frameListeners.remove(f);
	}

	@Override
	public void paintComponent(Graphics g) {
		for (FrameListener f : frameListeners) {
			f.onFrame();
		}
		g.drawImage(image, 0, 0, null);
	}
	
	public Graphics2D createGraphics() {
		return (Graphics2D)image.createGraphics();
	}
	
	public void setColour(int rgb) {
		this.rgb = rgb;
		graphics.setColor(new Color(rgb));		
	}
	
	public void clear() {
		graphics.fillRect(0, 0, width, height);
	}
	
	public void fill(int x, int y, int width, int height) {
		graphics.fillRect(x, y, width, height);
	}

	public void plot(int x, int y) {
		image.setRGB(x, y, rgb);
	}
}
