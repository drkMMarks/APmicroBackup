package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class reset extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;


	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					reset frame = new reset();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public reset() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 100, 100, 100, 100};
		gridBagLayout.rowHeights = new int[]{100, 50, 50, 50, 50, 50, 50, 50, 50, 100};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel reLabel1 = new JLabel("Micro Vision Cable");
		reLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		reLabel1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbcLabel1 = new GridBagConstraints();
		gbcLabel1.gridwidth = 3;
		gbcLabel1.insets = new Insets(0, 0, 5, 5);
		gbcLabel1.gridx = 1;
		gbcLabel1.gridy = 1;
		getContentPane().add(reLabel1, gbcLabel1);
		
		JLabel reLabel2 = new JLabel("Reset Login Password");
		GridBagConstraints gbcLabel2 = new GridBagConstraints();
		gbcLabel2.gridwidth = 3;
		gbcLabel2.insets = new Insets(0, 0, 5, 5);
		gbcLabel2.gridx = 1;
		gbcLabel2.gridy = 2;
		getContentPane().add(reLabel2, gbcLabel2);
		
		JLabel reLabel3 = new JLabel("User ID");
		reLabel3.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbcLabel3 = new GridBagConstraints();
		gbcLabel3.anchor = GridBagConstraints.WEST;
		gbcLabel3.insets = new Insets(0, 0, 5, 5);
		gbcLabel3.gridx = 1;
		gbcLabel3.gridy = 4;
		getContentPane().add(reLabel3, gbcLabel3);
		
		txt1 = new JTextField();
		txt1.setHorizontalAlignment(SwingConstants.CENTER);
		txt1.setText("Technician090");
		GridBagConstraints gbctxt1 = new GridBagConstraints();
		gbctxt1.gridwidth = 2;
		gbctxt1.insets = new Insets(0, 0, 5, 5);
		gbctxt1.fill = GridBagConstraints.HORIZONTAL;
		gbctxt1.gridx = 2;
		gbctxt1.gridy = 4;
		getContentPane().add(txt1, gbctxt1);
		txt1.setColumns(10);
		
		JLabel reLabel4 = new JLabel("Acc Num");
		GridBagConstraints gbcLabel4 = new GridBagConstraints();
		gbcLabel4.anchor = GridBagConstraints.ABOVE_BASELINE_LEADING;
		gbcLabel4.insets = new Insets(0, 0, 5, 5);
		gbcLabel4.gridx = 1;
		gbcLabel4.gridy = 5;
		getContentPane().add(reLabel4, gbcLabel4);
		
		txt2 = new JTextField();
		GridBagConstraints gbctxt2 = new GridBagConstraints();
		gbctxt2.gridwidth = 2;
		gbctxt2.insets = new Insets(0, 0, 5, 5);
		gbctxt2.fill = GridBagConstraints.HORIZONTAL;
		gbctxt2.gridx = 2;
		gbctxt2.gridy = 5;
		getContentPane().add(txt2, gbctxt2);
		txt2.setColumns(10);
		
		JLabel reLabel5 = new JLabel("Last Remembered Pswd");
		GridBagConstraints gbcLabel5 = new GridBagConstraints();
		gbcLabel5.anchor = GridBagConstraints.EAST;
		gbcLabel5.insets = new Insets(0, 0, 5, 5);
		gbcLabel5.gridx = 1;
		gbcLabel5.gridy = 6;
		getContentPane().add(reLabel5, gbcLabel5);
		
		txt3 = new JTextField();
		GridBagConstraints gbctxt3 = new GridBagConstraints();
		gbctxt3.gridwidth = 2;
		gbctxt3.insets = new Insets(0, 0, 5, 5);
		gbctxt3.fill = GridBagConstraints.HORIZONTAL;
		gbctxt3.gridx = 2;
		gbctxt3.gridy = 6;
		getContentPane().add(txt3, gbctxt3);
		txt3.setColumns(10);
		
		JButton btn1 = new JButton("RESET NOW");
		GridBagConstraints gbcbtn1 = new GridBagConstraints();
		gbcbtn1.insets = new Insets(0, 0, 5, 5);
		gbcbtn1.gridx = 2;
		gbcbtn1.gridy = 8;
		getContentPane().add(btn1, gbcbtn1);
		
		JButton btn2 = new JButton("RESET");
		GridBagConstraints gbcbtn2 = new GridBagConstraints();
		gbcbtn2.insets = new Insets(0, 0, 0, 5);
		gbcbtn2.gridx = 3;
		gbcbtn2.gridy = 11;
		getContentPane().add(btn2, gbcbtn2);
	}

}
