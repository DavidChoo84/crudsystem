package crudsystem;

import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class MainPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean success ;

	public MainPage() {
		setBounds(100, 100, 676, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Title = new JLabel("Welcome to Toy Shop");
		Title.setFont(new Font("Tw Cen MT", Font.PLAIN, 40));
		Title.setBounds(138, 37, 358, 55);
		contentPane.add(Title);
		
		JButton Login = new JButton("Login");
		Login.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		Login.setBounds(226, 134, 182, 55);
		contentPane.add(Login);
		
		JButton Register = new JButton("Register");
		Register.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		Register.setBounds(226, 236, 182, 55);
		contentPane.add(Register);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setVisible(true);
		
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage loginpage = new LoginPage();
				dispose();
			}
		});
		
		Register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage registerpage = new RegisterPage();
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		MainPage mainpage = new MainPage();
		 
	}
}
