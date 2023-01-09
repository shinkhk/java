package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Action;

public class ThisEx3 extends MFrame
implements ActionListener{
	Button btn;
	Random r;
	public ThisEx3() {
		super(500,350,Color.GREEN,true);
		r = new Random();
		btn = new Button("my Botton");
		add(btn,"South");
		btn.addActionListener(this);
	}
	
	public  Color rColor(){
		int rr,gg,bb;
		rr = r.nextInt(256);
		gg = r.nextInt(256);
		bb = r.nextInt(256);
		return new Color(rr,gg,bb);
	}
	
	public void actionPerformed(ActionEvent e) {
		MDialog md = new MDialog(this, "보이나요");
	}
	
	class MDialog extends Dialog
	implements ActionListener{
		
		Button mbtn;
		ThisEx3 f;
		
	 public MDialog(ThisEx3 f, String title) {
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
		f.setBackground(rColor());
		f.btn.setBackground(rColor());
		dispose();
		
	}
	
		
	}
	
	public static void main(String[] args) {
		new ThisEx3();
	}

}


