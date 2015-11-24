package fr.iutvalence.info.dut.m3105.preamble;

public class FigureSimple implements Figure {
	private final Shape shape;
	private final Position position;
	
	public FigureSimple(Shape shape, Position position) {
		this.shape = shape;
		this.position = position;
	}

	@Override
	public void draw() {
		shape.draw(position);
	}
}
