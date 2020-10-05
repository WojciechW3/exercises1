package exercises;

import tbs.SimpleGfx;
import tbs.FrameListener;

public class Exercise3 {
	public static void main(String[] args) {
		question7(); // Write the question you want to test here.
	}
	
	public static void question1() {
	    SimpleGfx s = SimpleGfx.startup(640, 480);
		s.setColour(0x0000f0);
		s.clear();		
	}
	
	public static void question2() {
		SimpleGfx s = SimpleGfx.startup(640, 480);
		s.setColour(0x986000);
		s.clear();
		s.setColour(0x0000f0);
		int x = 310;
		while (x < 360) { 
			s.plot(x, 240);
			x = x+1;}
		}
				
	

	public static void question3() {
		SimpleGfx s = SimpleGfx.startup(640, 480);
		s.setColour(0x986000);
		s.clear();
		s.setColour(0x0000f0);
		int x = 310;
		while (x < 360) { 
			s.plot(x, 240);
			x = x+1;}
		int y = 180;
		while (y < 300){
			s.plot(330, y);
			y = y+1;
		}
			
				
		
		
	}

	public static void question4() {
		SimpleGfx s = SimpleGfx.startup(640, 480);
		s.setColour(0x0000f0);
		s.clear();
		s.setColour(0xffff00);
		int x = 200;
		int i = x;
		while (x < 301) { 
			s.plot(x, i);
			s.plot(x, i+100);
			x = x+1;
		}
		while (i < 301) {
			s.plot(x, i);
			s.plot(x-101, i);
			i = i+1;
		}
		
		
		
		
	}

	public static void question5() {
		SimpleGfx s = SimpleGfx.startup(640, 480);
		s.setColour(0x0000f0);
		s.clear();
		s.setColour(0xffff00);
		int x = 200;
		int i = x;
		while (x < 301) {
			s.plot(x, i);
			x = x+1;
			i = i+1;
		}
		x = 300;
		i = 200;
		while (x > 199) {
			s.plot(x, i);
			x = x-1;
			i = i+1;
		}
		
	}

	public static void question6() {
		SimpleGfx s = SimpleGfx.startup(640, 480);
		s.setColour(0x0000f0);
		s.clear();
		s.setColour(0xffff00);
		int x = 1;
		int i = x;
		while (x < 640) {
			while (i != 480) {
				s.plot(x, i);
				i = i+1;
				
						
			}
		i = 1;
		x = x +10;
			
		}
		x = 1;
		i = 1;
		while (i < 480) {
			while (x != 640) {
				s.plot(x, i);
				x = x+1;
						
			}
		x = 1;
		i = i +10;
		
	}
}
public static void question7()
		{
	
	SimpleGfx s = SimpleGfx.startup(640, 480);
	s.setColour(0x0000f0);
	s.clear();
	s.setColour(0xffff00);
	double x = 0;
	double y = 0;
	x = Math.toRadians(x);
	y = Math.toRadians(y);
	
		
	
	
	
	
	while (x<200*Math.PI + 1) {
	
		double z = Math.cos(x)*150 + 300;
		double v = Math.sin(y)*150 + 300;
		int zint = (int)z;
		int vint = (int)v;
		
		s.plot(zint, vint);
		y = y + 0.1;
		x = x + 0.1;
		
		
	
		

	
	
	}}
			
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

