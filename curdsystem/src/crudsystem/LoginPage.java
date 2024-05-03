package crudsystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameField;
    private JPasswordField passwordField;
	
	// Mock user data (In a real app, use a database)
    private static final String[][] USERS = {
        {"staff", "password123", "staff"},
        {"admin", "admin123", "admin"}
    };

	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Title = new JLabel("Login");
		Title.setBounds(241, 11, 84, 52);
		Title.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		contentPane.add(Title);
		
		JToggleButton Back = new JToggleButton("Back");
		Back.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Back.setBounds(350, 210, 143, 36);
		contentPane.add(Back);
		
		JToggleButton Login = new JToggleButton("Login");
		Login.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		Login.setBounds(121, 210, 143, 36);
		contentPane.add(Login);
		
		JLabel userLabel = new JLabel("Username:");
		userLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
        userLabel.setBounds(121, 100, 100, 25);
        contentPane.add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(259, 103, 234, 22);
        contentPane.add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
        passLabel.setBounds(121, 136, 100, 25);
        contentPane.add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(259, 139, 234, 22);
        contentPane.add(passwordField);
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setVisible(true);
	    
	    Login.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            boolean loginSuccess = authenticate(username, password);

            if (loginSuccess) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                // Load the corresponding page based on the role
                loadNextPage(username);
                dispose();
            } 
            else if(usernameField.getText().isEmpty() || usernameField.getText().isEmpty()){
            	JOptionPane.showMessageDialog(this, "Login failed! Please fill in the missing field.");
            }
            else {
                JOptionPane.showMessageDialog(this, "Login failed! Incorrect username or password.");
            }
        });
	    
	    Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MainPage mainpage = new MainPage();
				
			}
		});
	}
	
	 	// User authentication logic
    	private boolean authenticate(String username, String password) {
        	for (String[] user : USERS) {
            	if (user[0].equals(username) && user[1].equals(password)) {
                	return true;
            	}
        	}
        	return false;
    	}
    	
		private void loadNextPage(String username) {
			for (String[] user : USERS) {
				if (user[0].equals(username)) {
					if ("staff".equals(user[2])) {
						JOptionPane.showMessageDialog(this, "Welcome, Staff!");
						// Open staff page (for demonstration purposes, a simple message)
					} else if ("admin".equals(user[2])) {
						JOptionPane.showMessageDialog(this, "Welcome, Admin!");
						// Open admin page (for demonstration purposes, a simple message)
					}
					return;
				}
			}
		}
		
	public static void main(String[] args) {
		LoginPage loginpage = new LoginPage();
		
	}
}