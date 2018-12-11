import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class homepage extends JFrame implements ActionListener{
	
	private JLabel item1;
	
	public homepage()
	{
		super("Homepage");
		setLayout(new FlowLayout());
		
		JButton Button=new JButton("Button");
		Button.setToolTipText("This is a Button ");
		add(Button);
		
		
		item1 = new JLabel("this is a sentence");
		item1.setToolTipText("this is gonna show up on hover");
		add(item1);
	}
	
	

}
