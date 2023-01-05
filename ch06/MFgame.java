package ch06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MFgame extends Frame{

		public MFgame() {
			this(300, 300, new Color(220,220,220), false);
		}
		
		public MFgame(int w, int h) {
			this(h, w, new Color(220,220,220), false);
		}
		
		public MFgame(Color c) {
			this(300, 300, c, false);
		}
		
		public MFgame(int w, int h, Color c, boolean flag) {
			setSize(w, h);
			setBackground(c);
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			setResizable(flag);
			setVisible(true);
	}
	
	
	public static void main(String[] args) {

		//new MFrame();
				//new MFrame(Color.cyan);
				new MFgame(500, 500, 
						new Color(100,200,100), true);
		
	}

}
