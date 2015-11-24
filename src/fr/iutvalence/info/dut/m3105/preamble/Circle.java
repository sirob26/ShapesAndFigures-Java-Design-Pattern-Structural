package fr.iutvalence.info.dut.m3105.preamble;

public class Circle implements Shape{
	
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw(Position position) {
		System.out.printf("Circle draw in position %d %d whith a radius of %d%n" ,position.getX(),position.getY(),this.radius);
	}

}
