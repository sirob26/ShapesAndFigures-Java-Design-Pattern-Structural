package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeShadow implements Shape{
	
	private int angle;
	private int intensity;
	private Shape shape;
	
	
	
	public ShapeShadow(Shape shape, int angle, int intensity) {
		this.angle = angle;
		this.intensity = intensity;
		this.shape = shape;
	}

	@Override
	public void draw(Position position) {
		System.out.println("<shadow angle=" + angle + " intensity="+intensity+">");
		this.shape.draw(position);
		System.out.println("\n</shadow>");
		
	}
}
