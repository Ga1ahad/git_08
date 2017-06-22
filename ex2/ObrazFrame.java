package ex2;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ObrazFrame extends JFrame{
	ArrayList<String> paths = new ArrayList<>();
	BufferedImage[] image = new BufferedImage[paths.size()];
	
	public ObrazFrame(String args, int i, int j) {

	
		int g=0;
		File folder = new File(args);
		File[] listOfFiles = folder.listFiles();


		for (File file : listOfFiles) {
			   if(accept(listOfFiles[g].getAbsolutePath()))
		    if (file.isFile()) {
		        paths.add(listOfFiles[g].getAbsolutePath());
		       g++;
		    }


		}
		
		
		 JPanel obrazPanel = new ObrazPanel(paths, i, j);
		 
		 add(obrazPanel);
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		
		
		
		
		
		
		
	}



	   public static boolean accept(String fname) {
	        if(fname.lastIndexOf('.')>0){
	            int lastIndex = fname.lastIndexOf('.');         
	            String str = fname.substring(lastIndex);
	 
	            if(str.equals(".gif") || str.equals(".jpg") || str.equals(".png") )
	                return true;
	        }
	        return false;
	    }
	 
	}
	

	
	
	
	
	
	
	

