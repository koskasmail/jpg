
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	private JFrame frame = null;
	private JLabel message = null;
	private JButton btnPlus = null;
	private JButton btnMinus = null;

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
		message.setText("0" + count);
		message.setBackground(Color.GREEN);
		frame.add(message);

		
		/****
		 * TODO add this buttons: btnPlus btnMinus status
		 */

		btnPlus = new JButton(" + ");
		btnPlus.setBounds(10, 11, 50, 22);
		frame.add(btnPlus);
		btnPlus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				count++;
				if (count < 10)
					msg = "0";
				else
					msg = "";

				message.setText(msg + "" + count);
			}
		});

		btnMinus = new JButton(" - ");
		btnMinus.setBounds(60, 11, 50, 22);
		frame.add(btnMinus);
		btnMinus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (count > 0)
					count--;

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
