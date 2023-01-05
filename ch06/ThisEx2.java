package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class ThisEx2 extends MFgame
implements ActionListener{
	Button btn;
	
	public ThisEx2() {
		super(500,350,Color.GREEN,true);
		btn = new Button("my Botton");
		add(btn,"South");
		btn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		MDialog md = new MDialog(this, "보이나요");
	}
	
	class MDialog extends Dialog
	implements ActionListener{
		
		Button mbtn;
		ThisEx2 f;
		
	 public MDialog(ThisEx2 f, String title) {
			super(f,title,true);
			this.f = f;
			setSize(150,100);
			mbtn = new Button("Click~~");
			mbtn.addActionListener(this);
			add(mbtn);
			setVisible(true);
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		f.btn.setBackground(Color.red);
		dispose();
		
	}
	
		
	}
	
	public static void main(String[] args) {
		new ThisEx2();
	}

}


