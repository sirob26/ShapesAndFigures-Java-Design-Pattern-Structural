package fr.iutvalence.info.dut.m3105.preamble;

public class CircleBuilder {
	
	private Shape circle;
	
	public CircleBuilder(int radius) {
		circle = new Circle(radius);
	}
	
	public CircleBuilder addBorder(int thickness){
		this.circle = new ShapeBorder(circle, thickness);
		return this;
	}
	
	public CircleBuilder addShadow(int angle, int intensity){
		this.circle = new ShapeShadow(circle,angle,intensity);
		return this;
	}
	
	public Shape getCircle(){
		return circle;
	}
}
