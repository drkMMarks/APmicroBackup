package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;

public class custDashboard extends JFrame 
{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					custDashboard frame = new custDashboard();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public custDashboard() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{100, 100, 100, 100,100, 100, 100};
		gridBagLayout.rowHeights = new int[]{100, 50, 50, 100, 100, 100};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel custLabel1 = new JLabel("Micro Cision Cable");
		custLabel1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbcLabel1 = new GridBagConstraints();
		gbcLabel1.gridwidth = 3;
		gbcLabel1.insets = new Insets(0, 0, 5, 5);
		gbcLabel1.gridx = 2;
		gbcLabel1.gridy = 0;
		getContentPane().add(custLabel1, gbcLabel1);
		
		JLabel CustLBL1 = new JLabel("Customer Login - WELCOME!");
		GridBagConstraints LBL1 = new GridBagConstraints();
		LBL1.gridwidth = 3;
		LBL1.insets = new Insets(0, 0, 5, 5);
		LBL1.gridx = 2;
		LBL1.gridy = 1;
		getContentPane().add(CustLBL1, LBL1);
	}

}
