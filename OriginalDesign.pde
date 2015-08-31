void setup()
{
	size(400, 400, P3D);
}


void draw() {

	noStroke();
	directionalLight(255, 255, 255, 0, 0, -100);
	translate(90, 90, -90);
	sphere(40);
	translate(100, 700, -40);
	sphere(500);

}


void mousePressed() {
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