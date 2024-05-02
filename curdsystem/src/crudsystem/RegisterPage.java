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

public class RegisterPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Title = new JLabel("Register");
		Title.setBounds(314, 10, 143, 50);
		Title.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		contentPane.add(Title);
		
		JPanel panel = new JPanel();
		panel.setBounds(76, 95, 183, 235);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel ConfirmPassword = new JLabel("  Confirm Password  ");
		panel.add(ConfirmPassword);
		ConfirmPassword.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel PhoneNumber = new JLabel("  Phone Number     ");
		panel.add(PhoneNumber);
		PhoneNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel Address = new JLabel("  Address ");
		panel.add(Address);
		Address.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel Username = new JLabel("  Username ");
		panel.add(Username);
		Username.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel Password = new JLabel("  Password");
		panel.add(Password);
		Password.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(260, 95, 433, 235);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField = new JTextField();
		textField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JToggleButton Back = new JToggleButton("Back");
		Back.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Back.setBounds(436, 365, 143, 36);
		contentPane.add(Back);
		
		JToggleButton Register = new JToggleButton("Register");
		Register.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Register.setBounds(196, 365, 143, 36);
		contentPane.add(Register);
		
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
		RegisterPage registerpage = new RegisterPage();
		
	}
}
