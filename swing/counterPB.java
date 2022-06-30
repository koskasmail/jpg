
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	private JFrame frame = null;
	private JLabel message = null;
	private JButton button = null;

	private int count = 0;
	private String msg = "";

	public Counter() {
		frame = new JFrame("Sample 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(340, 300);
		frame.setLayout(null);

		message = new JLabel();
		message.setBounds(10, 42, 180, 22);
		message.setBackground(Color.gray);
		message.setText("Button Not Pressed");
		message.setBackground(Color.GREEN);
		frame.add(message);

		button = new JButton("click");
		button.setBounds(10, 11, 100, 22);
		frame.add(button);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				count++;
				if (count < 10)
					msg = "0";
				else
					msg = "";

				message.setText(msg + "" + count);
			}
		});

		frame.setVisible(true);
	}
}
