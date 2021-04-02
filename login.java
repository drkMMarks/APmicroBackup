package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame 
{
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public login() 
	{
		setTitle("Micro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 100, 100, 100, 100};
		gridBagLayout.rowHeights = new int[]{100, 50, 50, 50, 50, 50, 50, 100, 100};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel logLabel1 = new JLabel("Micro Cable Vision");
		logLabel1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbclogLabel1 = new GridBagConstraints();
		gbclogLabel1.gridwidth = 3;
		gbclogLabel1.insets = new Insets(0, 0, 5, 5);
		gbclogLabel1.gridx = 1;
		gbclogLabel1.gridy = 0;
		getContentPane().add(logLabel1, gbclogLabel1);
		
		JLabel logLabel2 = new JLabel("User ID");
		GridBagConstraints gbcLbl2 = new GridBagConstraints();
		gbcLbl2.insets = new Insets(0, 0, 5, 5);
		gbcLbl2.anchor = GridBagConstraints.WEST;
		gbcLbl2.gridx = 1;
		gbcLbl2.gridy = 2;
		getContentPane().add(logLabel2, gbcLbl2);
		
		textField = new JTextField();
		GridBagConstraints gbctxtField = new GridBagConstraints();
		gbctxtField.gridwidth = 2;
		gbctxtField.insets = new Insets(0, 0, 5, 5);
		gbctxtField.fill = GridBagConstraints.HORIZONTAL;
		gbctxtField.gridx = 2;
		gbctxtField.gridy = 2;
		getContentPane().add(textField, gbctxtField);
		textField.setColumns(10);
		
		JLabel logLablel3 = new JLabel("Password");
		GridBagConstraints gbcLbl3 = new GridBagConstraints();
		gbcLbl3.anchor = GridBagConstraints.WEST;
		gbcLbl3.insets = new Insets(0, 0, 5, 5);
		gbcLbl3.gridx = 1;
		gbcLbl3.gridy = 3;
		getContentPane().add(logLablel3, gbcLbl3);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 2;
		gbc_passwordField.gridy = 3;
		getContentPane().add(passwordField, gbc_passwordField);
		
		JButton btn1 = new JButton("LOGIN");
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				gui.custDashboard.main(null);
				//.dispose();
			}
		});
		GridBagConstraints gbcbtn1= new GridBagConstraints();
		gbcbtn1.gridwidth = 3;
		gbcbtn1.insets = new Insets(0, 0, 5, 5);
		gbcbtn1.gridx = 1;
		gbcbtn1.gridy = 4;
		getContentPane().add(btn1, gbcbtn1);
		
		JLabel logLabel4 = new JLabel("Forgot password?");
		GridBagConstraints gbc_logLabel4 = new GridBagConstraints();
		gbc_logLabel4.anchor = GridBagConstraints.WEST;
		gbc_logLabel4.insets = new Insets(0, 0, 5, 5);
		gbc_logLabel4.gridx = 1;
		gbc_logLabel4.gridy = 6;
		getContentPane().add(logLabel4, gbc_logLabel4);
		
		JButton JBtn2 = new JButton("-->");
		JBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//String userID = txtField1.getText();
				gui.reset.main(null);
			}
		});
		GridBagConstraints gbc_JBtn2 = new GridBagConstraints();
		gbc_JBtn2.insets = new Insets(0, 0, 5, 5);
		gbc_JBtn2.gridx = 2;
		gbc_JBtn2.gridy = 6;
		getContentPane().add(JBtn2, gbc_JBtn2);
	}

}
