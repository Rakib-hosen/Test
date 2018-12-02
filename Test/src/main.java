import javax.swing.JFrame;

public class main {
	public static void main(String[] args)
	{
		final int RATE;
		RATE=10;			
		Eventhand e= new Eventhand();
		
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setSize(480,300);
		e.setVisible(true);
		
		
		homepage w = new homepage();
		w.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		w.setSize(480,300);
		w.setVisible(true);
		
		
	}

}
