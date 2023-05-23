package EX6;





	

	import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;

	import javax.swing.*;

	public class Source extends JFrame implements /*ItemListener*/ ActionListener {
		JCheckBox casse ;
		JPanel pane;
		JLabel et=new JLabel();
		
		public Source() {
			
			setTitle("EX6");
			setBounds(300,300,300,300);
			
			
			casse=new JCheckBox("case");
			pane=new JPanel();
			 et=new JLabel();
			 pane.setBackground(Color.BLACK);
			pane.add(casse);
			pane.add(et);
			getContentPane().add(pane);
			casse.addActionListener(this);
			
			
			setVisible(true);
			
			
			
			
			
		}
		

		
		
		

	



	public static void main(String[] args) {
		
		new Source();
		// TODO Auto-generated method stub

	}










	
	public void actionPerformed(ActionEvent e) {
		
	/*1	if(e.getSource() ==casse)
		{
			et.setText("vous venez cliquer sur la case" );
			
		}
		// TODO Auto-generated method stub
		
	}*/
		
		if(e.getActionCommand().equals("case"))
			et.setText("deuxieme choix");


	}






/*2	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource() ==casse)
		{
			et.setText("vous cliquez sur la case ");
		}
		// TODO Auto-generated method stub
		
	}*/




}
