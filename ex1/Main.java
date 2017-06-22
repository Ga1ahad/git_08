/**
 *
 *  @author Nguyen Adam S15264
 *
 */

package ex1;

import javax.swing.JFrame;

public class Main {

  public static void main(String[] args) {

    JFrame application = new JFrame(); 
    DrawPanel panel = new DrawPanel();
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    application.add(panel);
    application.setSize (960, 960);
    application.setVisible(true);

}
  
  

  
  
}
