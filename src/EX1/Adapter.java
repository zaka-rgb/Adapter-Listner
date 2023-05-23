package EX1;

import java.awt.event.*;

public class Adapter extends MouseAdapter{
	
	public void mouseClicked(MouseEvent ve) {
		System.out.print("vous venez de cliquer sur la fenetre grafique");
	}
}
