package ex2;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ObrazPanel extends JPanel implements Runnable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private BufferedImage images;
	ArrayList<String> paths;
	boolean o = true; 
	int p;
	int r;
	public ObrazPanel(ArrayList<String> paths, int i, int j) {

		this.p=i;
		this.r=j;
		
		this.paths = paths;

		Thread t1 = new Thread(this);
		t1.start();
	}

	public void run(){
		

		
		 for(int b=0; b<paths.size(); b++){	
			 
			 File imageFile = new File(paths.get(b));
			 
		
			 
    	try {
    		images = ImageIO.read(imageFile);
		
		} catch (IOException e) {
			System.out.println("no image");
			e.printStackTrace();
		}
    	
    	 try {
				Thread.sleep(p*1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
    		
    		revalidate();
    		repaint();
    		Dimension dimension = new Dimension(images.getWidth(), images.getHeight());
 			setPreferredSize(dimension);
 			
 			
 			
}
		o = false;
	}

	public void paintComponent(Graphics g) {
    super.paintComponent(g);
	Graphics2D g2d = (Graphics2D) g;
	if(o){
	g2d.drawImage(images, 0, 0, this);
	}
	else{
	g2d.drawString("end", 40, 120); 
	  Font f = new Font("Comic Sans MS", Font.BOLD, r);
	  g2d.setFont(f);	
	}


	}
}