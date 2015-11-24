package fr.iutvalence.info.dut.m3105.preamble;

public class FigureComplex implements Figure {
	private final Figure figure1;
	private final Figure figure2;
	private final int operation;
	
	
	public FigureComplex(Figure figure1, Figure figure2, int operation) {
		this.figure1 = figure1;
		this.figure2 = figure2;
		this.operation = operation;
	}


	@Override
	public void draw() {
		this.figure1.draw();
		System.out.println(operation);
		this.figure2.draw();
	}
	
}
