package pra1;

import java.awt.Frame;
import java.awt.Label;

public class AWT {
  
	public static void main(String[] args) {
		 Frame f=new Frame();
		 Label l=new Label("Well come frame");
		 f.add(l);
		 f.setSize(3000,3000);
		 f.setTitle("Awt Demo");
		 f.setVisible(true);
		 
	}  
}
