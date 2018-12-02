import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class homepage extends JFrame{
	
	private JLabel item1;
	
	public homepage()
	{
		super("Homepage");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("this is a sentence");
		item1.setToolTipText("this is gonna show up on hover");
		add(item1);
	}
	

}
