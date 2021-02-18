import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel label = new JLabel();
		label.setText("Please, enter the username and the password");
		label.setBounds(60, 20, 500, 25);
		label.setForeground(new Color(21, 66, 133)); //set text color
		panel.add(label);
		
		userLabel = new JLabel("Username:");
		userLabel.setBounds(10, 50, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 50, 165, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 80, 80, 25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 80, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(185, 120, 80, 25);
		button.addActionListener(new Main());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(100, 180, 500, 25);
		panel.add(success);
		
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Login");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if(user.equals("Hamid") && password.equals("hamidbattery")) {
			success.setForeground(new Color(36, 140, 32)); //set text color GREEN
			success.setText("Login successful!! :)");
		}
		else {
			success.setForeground(new Color(217, 30, 30)); //set text color RED
			success.setText("wrong username or password!! :(");
		}
		
	}

}
