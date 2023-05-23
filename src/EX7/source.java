package EX7;

import java.awt.Container;
import java.awt.event.*;


import javax.swing.*;

import EX6.Source;

public class source extends JFrame implements ActionListener {
JPanel pane;
JButton bouton;
JCheckBox CASE;
Container c=this.getContentPane();

public source() {
	
	setTitle("EX7");
	setBounds(300,300,300,300);
	setDefaultCloseOperation(3);
	
	pane=new JPanel();
	c.add(pane);
	
	bouton =new JButton("VALIDATION");
	pane.add(bouton);
	
	CASE=new JCheckBox("case");
	pane.add(CASE);
	
	
	bouton.addActionListener(this);
	//CASE.addActionListener(this);
	
	
	
	
	setVisible(true);
	
	
	
	
	
}


	
	
	
	
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		
		
			if(CASE.isSelected())
				System.out.println("la couche est coche");
		if(!CASE.isSelected())
			System.out.println("la couche n'est pas coche");
		
		// TODO Auto-generated method stub
		
	}
	/*if(CASE.isSelected()) {
							if(e.getSource() == bouton)
								System.out.println("la couche est coche");
							
}
else 
	System.out.println("la couche n' est pas coche");
		
		
	}
	*/


public static void main(String[] args) {
		
		new source();
		// TODO Auto-generated method stub

	}












	
}













	










