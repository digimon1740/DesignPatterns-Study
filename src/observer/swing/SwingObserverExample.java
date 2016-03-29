package observer.swing;
	
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingObserverExample implements ActionListener{
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();

		JButton button = new JButton("정말 해도 될까?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		Object obj = event.getSource();
		if (obj.equals("dd")) {

		}
	}

	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("안돼. 분명 나중에 후회할 거야!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("당연하지. 그냥 저질러 버려!");
		}
	}
}
