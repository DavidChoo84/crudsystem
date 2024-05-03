package crudsystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class RegisterPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Username_TextField;
	private JPasswordField Password_TextField;
	private JPasswordField ConfirmPassword_TextField;
	private JTextField PhoneNumber_TextField;
	private JTextField Address_TextField;

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
		panel.setBounds(48, 95, 166, 260);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Username = new JLabel("  Username ");
		Username.setBounds(0, 0, 166, 40);
		panel.add(Username);
		Username.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel Password = new JLabel("  Password");
		Password.setBounds(0, 53, 166, 40);
		panel.add(Password);
		Password.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel ConfirmPassword = new JLabel("  Confirm Password  ");
		ConfirmPassword.setBounds(0, 103, 166, 40);
		panel.add(ConfirmPassword);
		ConfirmPassword.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel PhoneNumber = new JLabel("  Phone Number     ");
		PhoneNumber.setBounds(0, 153, 166, 40);
		panel.add(PhoneNumber);
		PhoneNumber.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JLabel Address = new JLabel("  Address ");
		Address.setBounds(0, 203, 166, 40);
		panel.add(Address);
		Address.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(241, 95, 477, 260);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		Password_TextField = new JPasswordField();
		Password_TextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Password_TextField.setColumns(10);
		Password_TextField.setBounds(0, 51, 475, 41);
		panel_1.add(Password_TextField);
		
		ConfirmPassword_TextField = new JPasswordField();
		ConfirmPassword_TextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		ConfirmPassword_TextField.setColumns(10);
		ConfirmPassword_TextField.setBounds(0, 102, 475, 41);
		panel_1.add(ConfirmPassword_TextField);
		
		PhoneNumber_TextField = new JTextField();
		PhoneNumber_TextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		PhoneNumber_TextField.setColumns(10);
		PhoneNumber_TextField.setBounds(0, 153, 475, 41);
		panel_1.add(PhoneNumber_TextField);
		
		Address_TextField = new JTextField();
		Address_TextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Address_TextField.setColumns(10);
		Address_TextField.setBounds(0, 204, 475, 41);
		panel_1.add(Address_TextField);
		
		Username_TextField = new JTextField();
		Username_TextField.setBounds(0, 0, 475, 41);
		panel_1.add(Username_TextField);
		Username_TextField.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Username_TextField.setColumns(10);
		
		JToggleButton Back_btn = new JToggleButton("Back");
		Back_btn.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Back_btn.setBounds(436, 365, 143, 36);
		contentPane.add(Back_btn);
		
		JToggleButton Register_btn = new JToggleButton("Register");
		Register_btn.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Register_btn.setBounds(196, 365, 143, 36);
		contentPane.add(Register_btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setVisible(true);
	    
	    Back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainPage mainpage = new MainPage();
				
			}
		});
	    
	    Register_btn.addActionListener(e -> {
            	{
                // Perform registration actions here
                String username = Username_TextField.getText();
                String password = new String(Password_TextField.getPassword());
                String confirmPassword = new String(ConfirmPassword_TextField.getPassword());
                String phoneNumber = PhoneNumber_TextField.getText();
                String address = Address_TextField.getText();

                // Validate input fields (e.g., check if passwords match)
                if (username.isEmpty() || password.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || phoneNumber.isEmpty() ||
                	address.isEmpty()) {
                	JOptionPane.showMessageDialog(this, "Please fill in all needed information");
                }
                else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(this, "Your password and confirm password doenst match.");
                       return;
                }
                else {
                    JOptionPane.showMessageDialog(this, "Your account has been register successfully!");
                    MainPage mainpage = new MainPage();
                    dispose();
               }
                
                // Call a method to register the user with the provided information
                // For example, you can call a service method to save the user to the database
                // userService.registerUser(username, password, phoneNumber, address);

                // After successful registration, you can navigate to another page or perform any other actions
                
                // You can navigate to the main page or any other page as
            }
	    });
	}
	
	
	
	public static void main(String[] args) {
		RegisterPage registerpage = new RegisterPage();
		
	}
}
