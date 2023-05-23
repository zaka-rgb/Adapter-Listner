package EX2;

import java.awt.event.*;


public class Listener extends MouseAdapter{
	
	
	
	int total=0;
		
	public void mouseClicked(MouseEvent ve) {
		
		
		
		total++;
		System.out.print("("+ve.getX()+":"+ve.getY()+")"+"=>"+total+":"+ve.getClickCount());
			}

	}
