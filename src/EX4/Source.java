package EX4;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;

import javax.swing.*;

public class Source extends JPanel implements MouseListener{
	static int total=0 ;
	static JLabel et;
	static JPanel p;
	public Source() {
		
		super();
		p=new JPanel();
		add(p);
		et =new JLabel("Le Nombre est"+total);
		p.add(et);
		p.addMouseListener(new Listner());
		addMouseListener(this);
		 
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		total++;
		System.out.print(""+total);
		et.setText("Le nombre est"+total);
		setBackground(Color.red);
		
		
		
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