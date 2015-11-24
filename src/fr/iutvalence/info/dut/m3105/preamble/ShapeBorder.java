package fr.iutvalence.info.dut.m3105.preamble;

public class ShapeBorder implements Shape {

	private int thickness;
	private Shape shape;

	public ShapeBorder(Shape shape, int thick) {
		this.shape = shape;
		thickness = thick;
	}

	@Override
	public void draw(Position position) {
		System.out.println("<thick " + thickness + ">");
		this.shape.draw(position);
		System.out.println("</thick>");
	}

}
