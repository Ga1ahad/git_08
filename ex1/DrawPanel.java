package ex1;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g){
	    super.paintComponent(g);
		g.setColor(Color.BLUE);
	    g.drawLine(getX(), getY(), getX()+getWidth(), getY()+ getHeight());
		g.setColor(Color.BLUE);
	    g.drawLine(getX()+getWidth(), getY(), getX(), getY()+ getHeight());
	    
	}

	public DrawPanel(){
	

		
	}
}