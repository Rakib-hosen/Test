import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Eventhand extends JFrame {
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	
	private JPasswordField passwordField;
	
	public Eventhand ()
	{
		super("Event handaling");
		setLayout(new FlowLayout());
		
		JLabel label1=new JLabel("UserName");
		add(label1);
		
		
		item1 = new JTextField(10);
		add(item1);
		
		JLabel label2=new JLabel("PassWord");
		add(label2);
		
//		item2 = new JTextField("enter text here");
//		add(item2);
		
//		item3 = new JTextField("Uneditable",20);
//		item3.setEditable(false);
//		add(item3);
		
		passwordField = new JPasswordField("My password");
		add(passwordField);
		
		JButton button1= new JButton("Log in");
		add(button1);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		//item2.addActionListener(handler);
		//item3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
		
	}
	
	private class thehandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event)
		{
			
			String string = " ";
			
			if(event.getSource()==item1)
				string=String.format("field 1: %s",event.getActionCommand());
			
//			else if(event.getSource()==item2)
//				string=String.format("field 2: %s",event.getActionCommand());
			
//			else if(event.getSource()==item1)	
//				string=String.format("field 3: %s",event.getActionCommand());
			
			else if (event.getSource()==passwordField)
				string=String.format("passwordField is : %s",event.getActionCommand());
			
			JOptionPane.showMessageDialog(null,string);
		}
		
	}

}
