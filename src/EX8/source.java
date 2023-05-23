package EX8;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.*;

public class source extends JFrame implements ActionListener  {
	
	JPanel pane1;
	JPanel pane2;
	
	JButton bouton1;
	JButton bouton2;
	JButton bouton3;
	
	JLabel et;
	
	Container c=this.getContentPane();

	public source() {
		
		setTitle("EX7");
		setBounds(300,300,300,300);
		setDefaultCloseOperation(3);
		c.setLayout(new BorderLayout());
		pane1=new JPanel();
		c.add(pane1,BorderLayout.WEST);
		pane1.setLayout(new GridLayout(0,1));
		
		pane2=new JPanel();
		c.add(pane2,BorderLayout.CENTER);
		
		bouton1 =new JButton("Bouton1");
		pane1.add(bouton1);
		bouton1.addActionListener(this);
		
		bouton2 =new JButton("Bouton2");
		pane1.add(bouton2);
		bouton2.addActionListener(this);
		
		bouton3 =new JButton("Bouton3");
		pane1.add(bouton3);
		bouton3.addActionListener(this);
		
		 et=new JLabel("");
		 pane2.add(et,BorderLayout.CENTER);
		
		
		
		
		
		setVisible(true);
		
		
	}


		
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		et.setText("okk friends");
		Toolkit.getDefaultToolkit().beep();
		// TODO Auto-generated method stub
		
	}
public static void main (String[] args ) {
	
	new source();
}
}
