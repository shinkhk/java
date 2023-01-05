package ch06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends MFgame{
	
	Random r;
	public MyFrame() {
		super(500,500,Color.WHITE,false);
		r = new Random();
	}
	
	public  Color rColor(){
		int rr,gg,bb;
		rr = r.nextInt(256);
		gg = r.nextInt(256);
		bb = r.nextInt(256);
		return new Color(rr,gg,bb);
	}
	
	public void paint(Graphics g) {
//		g.setColor(rColor()); // 붓에 파란색
//		g.drawString("반갑습니다", 50, 50);
//		g.drawRect(50, 50, 200, 100);
		for(int i=0;i<10000;i++) {
		g.setColor(rColor());
		int x =r.nextInt(500);
		int y =r.nextInt(500);
		int v =r.nextInt(10)+5;
		int h =r.nextInt(10)+5;
		g.drawRect(x, y, v, h);
		try {
		Thread.sleep(10);	
		}catch(Exception e) {}
		}
		
	}


	public static void main(String[] args) {	
		new MyFrame();
		
	}
}
