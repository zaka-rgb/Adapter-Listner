package EX3;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;

public class Source extends JFrame implements MouseListener{
	static JPanel j=new JPanel();
	Container c=getContentPane();
	
	public Source(String title) {
		setTitle(title);
		setVisible(true);
		setDefaultCloseOperation(3);
		setBounds(300,300,300,300);
		j.setBackground(Color.ORANGE);
		addMouseListener(new Listner());
		c.add(j);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.print("vous venez cliqier");
		j.setBackground(Color.black);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}