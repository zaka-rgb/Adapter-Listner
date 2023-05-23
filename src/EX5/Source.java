package EX5;

import java.awt.*;

import java.awt.event.*;


import javax.swing.*;


public class Source extends JFrame implements ActionListener{
	
	JButton bouton1;
	JButton bouton2;
	
	public Source() {
		
		Container c=this.getContentPane();
		JPanel panel=new JPanel();
		c.add(panel);
		
		setTitle("EX5");
		setVisible(true);
		setDefaultCloseOperation(3);
		setBounds(300,300,300,300);
		getContentPane().setBackground(Color.ORANGE);
		 bouton1=new JButton("Bouton 1");
		 bouton2=new JButton("Bouton 2");
		panel.add(bouton1);
		panel.add(bouton2);
		
		bouton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev){System.out.println("action sur un bouton1");}
		});
		
		bouton2.addActionListener(this);
		
	

		
		}
	public void actionPerformed(ActionEvent ev){
	
		//1 System.out.println("action sur un bouton");
		
		
		
	 if(ev.getSource()== bouton1)
			System.out.println("action sur un bouton1");
			if(ev.getSource()== bouton2)
				System.out.println("action sur un bouton2");
		
	
	/*if(ev.getActionCommand().equals("Bouton 1"))
	System.out.println("action sur un bouton1");
	if(ev.getActionCommand().equals("Bouton 2"))
		System.out.println("action sur un bouton2");*/

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Source();
	}
	
	
	
	

}
