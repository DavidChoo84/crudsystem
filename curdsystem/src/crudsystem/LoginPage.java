package crudsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Title = new JLabel("Login");
		Title.setBounds(349, 10, 84, 52);
		Title.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		contentPane.add(Title);
		
		JToggleButton Back = new JToggleButton("Back");
		Back.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Back.setBounds(436, 365, 143, 36);
		contentPane.add(Back);
		
		JToggleButton Login = new JToggleButton("Login");
		Login.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Login.setBounds(196, 365, 143, 36);
		contentPane.add(Login);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setVisible(true);
	    
	    Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainPage mainpage = new MainPage();
				
			}
		});
	}
	
	public static void main(String[] args) {
		LoginPage loginpage = new LoginPage();
		
	}
}
