import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
	size(400, 400, P3D);
}


public void draw() {

	noStroke();
	directionalLight(255, 255, 255, 0, 0, -100);
	translate(90, 90, -90);
	sphere(40);
	translate(100, 700, -40);
	sphere(500);

}


public void mousePressed() {
	int red = (int)(Math.random()*256);
	int green = (int)(Math.random()*256);
	int blue = (int)(Math.random()*256);
	int moonred = (int)(Math.random()*256);
	int moongreen = (int)(Math.random()*256);
	int moonblue = (int)(Math.random()*256);
	redraw();

	background(red, green, blue);
	fill(moonred+100, moongreen+100, moonblue+100);
	sphere(40);
	sphere(500);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
