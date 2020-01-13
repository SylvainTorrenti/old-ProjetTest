package exercicePerso;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestTextField extends JFrame implements ActionListener {

	private JLabel label;
	private JButton button;
	private JTextField textfield;
	String userWord = "";

	public TestTextField() {
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		label = new JLabel("Gabi est fort à lol!");
		add(label);

		textfield = new JTextField(15);
		add(textfield);

		button = new JButton("La vérité");
		add(button);
		button.addActionListener(this);
	}

	public static void main(String[] args) {
		TestTextField test = new TestTextField();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		test.setVisible(true);
		test.setSize(500, 125);
		test.setTitle("Leona est le meilleur champion!");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			setTitle("Leona reste toujours le meilleur champion!");
			label.setText("C'est pas vrai il est que gold...");
		}
	}

}