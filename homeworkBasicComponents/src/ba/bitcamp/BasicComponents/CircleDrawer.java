package ba.bitcamp.BasicComponents;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 
public class CircleDrawer extends JPanel{
	
	private static final long serialVersionUID = 1069764717656916888L;
	
	private JSlider slider = new JSlider(0, 100, 0);
	private int x;
	private int y;
	private int radius;
	private boolean click;
	
	/**
	 *Constructor.
	 */
	public CircleDrawer() {
		setLayout(new BorderLayout());
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				if(click){
					radius = slider.getValue();
					System.out.println(radius);
					repaint();					
				}
			}
		});
		addMouseListener(new Action());
		add(slider, BorderLayout.NORTH);
	}
	
	private class Action extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			x = e.getX();
			y = e.getY();
			click = true;
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(x - radius / 2, y - radius / 2, radius, radius);
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Circle Drawer");
		window.setContentPane(new CircleDrawer()); 
		window.setSize(400, 400);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
