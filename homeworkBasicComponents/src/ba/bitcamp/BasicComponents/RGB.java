package ba.bitcamp.BasicComponents;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RGB extends JFrame{
	
	private static final long serialVersionUID = 3899396759424517762L;
	
	private int red;
	private int green;
	private int blue;
	private JSlider label1 = new JSlider(0, 255);
	private JSlider label2 = new JSlider(0, 255);
	private JSlider label3 = new JSlider(0, 255);
	
	/**
	 *Constructor.
	 */
	public RGB() {
		
		setLayout(new GridLayout(3, 2));
		initSlider(label1, "Red");
		initSlider(label2, "Green");
		initSlider(label3, "Blue");
		
		setTitle("RGB");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void initSlider(JSlider slider, String color){
		slider.setValue(0);
		updateBackgound();
		slider.setAutoscrolls(true);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider changed = (JSlider) e.getSource();
				switch (color) {
				case "Red":
					red = changed.getValue();
					break;
				case "Green":
					green = changed.getValue();
					break;
				case "Blue":
					blue = changed.getValue();
					break;
				}
				updateBackgound();
			}

		});
		add(slider);
	}
	
	private void updateBackgound() {
		label1.setBackground(new Color(red, green, blue));
		label2.setBackground(new Color(red, green, blue));
		label3.setBackground(new Color(red, green, blue));
		repaint();
	}
	
	public static void main(String[] args) {
		new RGB();
	}
}